var app = angular.module('GerenciarDevolucao.module', ['angularUtils.directives.dirPagination']);
 
app.controller('cruddevolucao', function($scope, $http) {
	$scope.sucesso = false;
	$scope.erro = false;

	$scope.pesquisardevolucoes = function() {
		var url = "/sislogis/rest/devolucao/pesquisardevolucoes";

 		var filtros = {

 			params: {
	 			'numPedido' : $scope.numPedido == '' ? null : $scope.numPedido,
	 			'dataPedidoMin' : $scope.dataPedidoMin == '' ? null : $scope.dataPedidoMin,
	 			'dataPedidoMax' : $scope.dataPedidoMax == '' ? null : $scope.dataPedidoMax,
	 			'valorPedidoMin' : $scope.valorPedidoMin == '' ? null : $scope.valorPedidoMin,
	 			'valorPedidoMax' : $scope.valorPedidoMax == '' ? null : $scope.valorPedidoMax
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
			$scope.mensagemSucesso = "Devolução registrada com sucesso.";
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

	$scope.sort = function(keyname){
        $scope.sortKey = keyname;   
        $scope.reverse = !$scope.reverse; 
    };

    $scope.switchBool = function(value) {
	   $scope[value] = !$scope[value];
	};

});
