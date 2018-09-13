var app = angular.module('GerenciarDevolucao.module', []);
 
app.controller('cruddevolucao', function($scope, $http) {
	$scope.sucesso = false;
	$scope.erro = false;

	$scope.pesquisardevolucoes = function() {
		var url = "/sislogis/rest/devolucao/pesquisardevolucoes";

 		var filtros = {

 			params: {
	 			'numPedido' : $scope.numPedido == '' ? null : $scope.numPedido,
	 			'dataPedido' : $scope.dataPedido == '' ? null : $scope.dataPedido,
	 			'valor' : $scope.valor == '' ? null : $scope.valor
 		    }
 		};

		$http.get(url, filtros).then(function(response) {
			$scope.listaDevolucao = response.data;
		});
	}

	$scope.enviarFormulario = function() {

		var dados = {
			idDevolucao : $scope.acao == 'Incluir' ? null : $scope.idDevolucao,
			descDevolucao : $scope.descDevolucaoModal,
			valorDevolucao : $scope.valorDevolucaoModal
		};

		if ($scope.acao == 'Incluir') {
			var url = "/sislogis/rest/devolucao/incluirdevolucao";
			$http.post(url, dados).then(function(response) {
				$scope.mensagemSucesso = "Dados inseridos com sucesso.";
				$scope.sucesso = true;
				$scope.fecharModal();
				$scope.descDevolucaoModal = "";
				$scope.valorDevolucaoModal = "";
				$scope.pesquisardevolucoes();
		});
	    } else {
	    	var url = "/sislogis/rest/devolucao/alterardevolucao";
	    	$http.put(url, dados).then(function(response) {
				$scope.mensagemSucesso = "Dados alterados com sucesso.";
				$scope.sucesso = true;
				$scope.fecharModal();
				$scope.descDevolucaoModal = "";
				$scope.valorDevolucaoModal = "";
				$scope.pesquisardevolucoes();
		});
	    }
	};

	$scope.incluirdevolucao = function () {
		$scope.descDevolucaoModal = "";
		$scope.valorDevolucaoModal = "";
		$scope.tituloModal = "Incluir Devolucao";
		$scope.acao = "Incluir";
		$scope.openModal();
	};

	$scope.alterardevolucao = function(devolucao) {
		$scope.idDevolucao = devolucao.idDevolucao;
		$scope.descDevolucaoModal = devolucao.descDevolucao;
		$scope.valorDevolucaoModal = devolucao.valorDevolucao;
		$scope.tituloModal = 'Alterar Devolucao';			
		$scope.acao = 'Alterar';
		$scope.openModal();
	};

	$scope.excluirdevolucao = function(devolucao) {
		var url = "/sislogis/rest/devolucao/excluirdevolucao";

		var dados = {
 			params: {
	 			'idDevolucao' : devolucao.idDevolucao
 		    }
 		};

		if(confirm("Deseja realmente excluir item?")) {
			$http.delete(url, dados).then(function(response) {
				$scope.mensagemSucesso = "Item exluído com sucesso.";
				$scope.sucesso = true;
				$scope.pesquisardevolucoes();
			});
		}
	};

	$scope.fecharModal = function() {
		var modal_popup = angular.element( document.querySelector('#modalDevolucao'));
		modal_popup.modal('hide');
	};

	$scope.openModal = function() {
		var modal_popup = angular.element( document.querySelector('#modalDevolucao'));
		modal_popup.modal('show');
	};
});


