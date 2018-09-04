var app = angular.module('GerenciarFrete.module', [])
 
app.controller('listartarifas', function($scope, $http, $location) {

	$scope.listartarifas = function() {
		var url = "/sislogis/rest/tarifa/listartarifas";
 
		$http.get(url).then(function(response) {
			$scope.listaTarifa = response.data;
		});
	}
});