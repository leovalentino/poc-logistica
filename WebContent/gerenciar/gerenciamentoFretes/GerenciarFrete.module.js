var app = angular.module('GerenciarFrete.module', ['ngTable'])
 
app.controller('pesquisartarifas', function($scope, $http, $location) {

	$scope.pesquisartarifas = function() {
		var url = "/sislogis/rest/tarifa/pesquisartarifas";
 
		var self = this;

 		var filtros = {

 			params: {
	 			'descTarifa' : $scope.descTarifa == '' ? null : $scope.descTarifa,
	 			'valorTarifa' : $scope.valorTarifa == '' ? null : $scope.valorTarifa 
 		    }
 		};

		$http.get(url, filtros).then(function(response) {
			$scope.listaTarifa = response.data;
			var data = $scope.listaTarifa;
			self.tabelParams = new NgTableParams({}, {dataset : data});
		});
	}
});