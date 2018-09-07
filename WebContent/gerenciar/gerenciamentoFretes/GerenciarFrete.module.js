var app = angular.module('GerenciarFrete.module', ['ngTable']);
 
app.controller('pesquisartarifas', function($scope, $http, NgTableParams) {

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
			self.tableParams = new NgTableParams({}, {dataset : $scope.listaTarifa});
		});
	}
});

app.controller('incluirtarifa', function($scope, $http) {
	$scope.incluirtarifa = function() {
		var url = "/sislogis/rest/tarifa/incluirtarifa";

		var dados = {
			descTarifa : $scope.descTarifa,
			valorTarifa : $scope.valorTarifa
		};

		$http.post(url, dados).then(function(response) {
			$scope.postResultMessage = "Dados inseridos com sucesso."
			$scope.fecharModal();
		});
	};

	$scope.fecharModal = function() {
		var modal_popup = angular.element( document.querySelector( '#exampleModal' ) );
		modal_popup.modal('hide');
	};
});

