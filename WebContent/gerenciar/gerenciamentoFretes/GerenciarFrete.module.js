var app = angular.module('GerenciarFrete.module', [])
 
app.controller('listartarifas', function($scope, $http, $location) {

	$scope.listartarifas = function() {
		var url = "/POC-Sistema-Logistica-0.0.1-SNAPSHOT/rest/tarifa/listartarifas";
 
		$http.get(url).then(function(response) {
			$scope.listaTarifa = response.data;
		});
	}
});