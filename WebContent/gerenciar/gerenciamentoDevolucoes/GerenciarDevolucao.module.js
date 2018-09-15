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

	$scope.pesquisarpedidopornum = function() {
		var url = "/sislogis/rest/devolucao/pesquisarpedidopornum";

		var filtros = {

		params: {
 			'numPedido' : $scope.numPedidoModal == '' ? null : $scope.numPedidoModal
 		    }
 		};

		$http.get(url, filtros).then(function(response) {
			$scope.pedido = response.data;
		});

	};

	$scope.enviarFormulario = function() {

		var dados = {
			numPedido : $scope.numPedidoModal,
			descProduto : $scope.pedido.descProduto,
			dataPedido : $scope.pedido.dataPedido,
			descMotivo : $scope.pedido.descMotivo
		};

		var url = "/sislogis/rest/devolucao/incluirdevolucao";
		$http.post(url, dados).then(function(response) {
			$scope.mensagemSucesso = "Dados inseridos com sucesso.";
			$scope.sucesso = true;
			$scope.fecharModal();
			$scope.descDevolucaoModal = "";
			$scope.valorDevolucaoModal = "";
			$scope.pesquisardevolucoes();
		});

	};

	$scope.incluirdevolucao = function () {
		$scope.descDevolucaoModal = "";
		$scope.valorDevolucaoModal = "";
		$scope.tituloModal = "Incluir Devolucao";
		$scope.acao = "Registrar";
		$scope.openModal();
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
