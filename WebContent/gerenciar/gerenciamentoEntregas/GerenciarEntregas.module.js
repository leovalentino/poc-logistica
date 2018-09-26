var app = angular.module('GerenciarEntregas.module', ['angularUtils.directives.dirPagination']);
 
app.controller('acompanhamentoEntrega', function($scope, $http) {
	$scope.sucesso = false;
	$scope.erro = false;

	$scope.pesquisarentregas = function() {
		var url = "/sislogis/rest/entrega/pesquisarentregas";

 		var filtros = {

 			params: {
	 			'numPedido' : $scope.numPedido == '' ? null : $scope.numPedido,
	 			'nomeTransportadora' : $scope.transportadora == '' ? null : $scope.transportadora,
	 			'dataPedido' : $scope.dataPedido == '' ? null : $scope.dataPedido,
	 			'descProduto' : $scope.descProduto == '' ? null : $scope.descProduto,
	 			'descSituacaoEntrega' : $scope.situacao  == '' ? null : $scope.situacao,
	 			'nomeCliente' : $scope.nomeCliente == '' ? null : $scope.nomeCliente
 		    }
 		};

		$http.get(url, filtros).then(function(response) {
			$scope.listaEntrega = response.data;
		});
	}

	$scope.listarsituacaoentrega = function() {
		var url = "/sislogis/rest/entrega/listarsituacaoentrega";

		$http.get(url).then(function(response) {
			$scope.listaSituacaoEntrega = response.data;
		});
	};

	$scope.listartransportadora = function() {
		var url = "/sislogis/rest/entrega/listartransportadora";

		$http.get(url).then(function(response) {
			$scope.listaTransportadora = response.data;
		});
	};

	$scope.sort = function(keyname){
        $scope.sortKey = keyname;   
        $scope.reverse = !$scope.reverse; 
    };

    $scope.switchBool = function(value) {
	   $scope[value] = !$scope[value];
	};

});
