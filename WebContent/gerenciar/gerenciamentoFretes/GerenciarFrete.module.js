var app = angular.module('GerenciarFrete.module', ['angularUtils.directives.dirPagination']);

app.filter('pesquisartarifas', function() {
	
});
 
app.controller('crudtarifa', function($scope, $http) {
	$scope.sucesso = false;
	$scope.erro = false;

	$scope.pesquisartarifas = function() {
		var url = "/sislogis/rest/tarifa/pesquisartarifas";

 		var filtros = {

 			params: {
	 			'descTarifa' : $scope.descTarifa == '' ? null : $scope.descTarifa,
	 			'valorMinTarifa' : $scope.valorMinTarifa == '' ? null : $scope.valorMinTarifa,
	 			'valorMaxTarifa' : $scope.valorMaxTarifa == '' ? null : $scope.valorMaxTarifa 
 		    }
 		};

		$http.get(url, filtros).then(function(response) {
			$scope.listaTarifa = response.data;
		});
	}

	$scope.enviarFormulario = function() {

		var dados = {
			idTarifa : $scope.acao == 'Incluir' ? null : $scope.idTarifa,
			descTarifa : $scope.descTarifaModal,
			valorTarifa : $scope.valorTarifaModal
		};

		if ($scope.acao == 'Incluir') {
			var url = "/sislogis/rest/tarifa/incluirtarifa";
			$http.post(url, dados).then(function(response) {
				$scope.sucesso = true;
				$scope.mensagemSucesso = "Dados inseridos com sucesso.";
				$scope.fecharModal();
				$scope.descTarifaModal = "";
				$scope.valorTarifaModal = "";
				$scope.pesquisartarifas();
		});
	    } else {
	    	var url = "/sislogis/rest/tarifa/alterartarifa";
	    	$http.put(url, dados).then(function(response) {
	    		$scope.sucesso = true;
				$scope.mensagemSucesso = "Dados alterados com sucesso.";
				$scope.fecharModal();
				$scope.descTarifaModal = "";
				$scope.valorTarifaModal = "";
				$scope.pesquisartarifas();
		});
	    }
	};

	$scope.incluirtarifa = function () {
		$scope.descTarifaModal = "";
		$scope.valorTarifaModal = "";
		$scope.tituloModal = "Incluir Tarifa";
		$scope.acao = "Incluir";
		$scope.openModal();
	};

	$scope.alterartarifa = function(tarifa) {
		$scope.idTarifa = tarifa.idTarifa;
		$scope.descTarifaModal = tarifa.descTarifa;
		$scope.valorTarifaModal = tarifa.valorTarifa;
		$scope.tituloModal = 'Alterar Tarifa';			
		$scope.acao = 'Alterar';
		$scope.openModal();
	};

	$scope.excluirtarifa = function(tarifa) {
		var url = "/sislogis/rest/tarifa/excluirtarifa";

		var dados = {
 			params: {
	 			'idTarifa' : tarifa.idTarifa
 		    }
 		};

		if(confirm("Deseja realmente excluir item?")) {
			$http.delete(url, dados).then(function(response) {
				$scope.mensagemSucesso = "Item exluído com sucesso.";
				$scope.sucesso = true;
				$scope.pesquisartarifas();
			});
		}
	};

	$scope.fecharModal = function() {
		var modal_popup = angular.element( document.querySelector('#modalTarifa'));
		modal_popup.modal('hide');
	};

	$scope.openModal = function() {
		var modal_popup = angular.element( document.querySelector('#modalTarifa'));
		modal_popup.modal('show');
	};


	$scope.simularTarifa = function(tarifa) {
		$scope.resultado = tarifa * $scope.valorCarga;
	};

	$scope.listartarifas = function() {
		var url = "/sislogis/rest/tarifa/listartarifa";

		$http.get(url).then(function(response) {
			$scope.listaTarifa = response.data;
		});

		$scope.openModalSimulacao();
	};


	$scope.fecharModalSimulacao = function() {
		var modal_popup = angular.element( document.querySelector('#modalSimulacao'));
		modal_popup.modal('hide');
	};

	$scope.openModalSimulacao = function() {
		var modal_popup = angular.element( document.querySelector('#modalSimulacao'));
		modal_popup.modal('show');
	};

	$scope.sort = function(keyname){
        $scope.sortKey = keyname;   
        $scope.reverse = !$scope.reverse; 
    }

});


