var app = angular.module('GerenciarEntregas.module', []);
 
app.controller('acompanhamentoEntrega', function($scope, $http) {
	$scope.sucesso = false;
	$scope.erro = false;

	$scope.pesquisardevolucoes = function() {
		var url = "/sislogis/rest/entrega/pesquisarentregas";

 		var filtros = {

 			params: {
	 			'numPedido' : $scope.numPedido == '' ? null : $scope.numPedido,
	 			'nomeTransportadora' : $scope.nomeTransportadora == '' ? null : $scope.nomeTransportadora,
	 			'dataPedido' : $scope.dataPedido == '' ? null : $scope.dataPedido,
	 			'descProduto' : $scope.descProduto == '' ? null : $scope.descProduto,
	 			'descSituacaoEntrega' : $scope.descSituacaoEntrega == '' ? null : $scope.descSituacaoEntrega,
	 			'nomeCliente' : $scope.nomeCliente == '' ? null : $scope.nomeCliente
 		    }
 		};

		$http.get(url, filtros).then(function(response) {
			var listaResultado = response.data;
		});
	}
});
