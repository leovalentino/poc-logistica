var app = angular.module('GerenciarFrete.module', [])
 
app.controller('pesquisartarifas', function($scope, $http, $location) {

	$scope.pesquisartarifas = function() {
		var url = "/sislogis/rest/tarifa/pesquisartarifas";
 
 		var filtros = {
 			'descTarifa' : $scope.descTarifa == '' ? null : $scope.descTarifa,
 			'valorTarifa' : $scope.valorTarifa == '' ? null : $scope.valorTarifa 
 		};

		$http.get(url, filtros).then(function(response) {
			$scope.listaTarifa = response.data;
		});
	}
});