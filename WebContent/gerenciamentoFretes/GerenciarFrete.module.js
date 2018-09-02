 
app.controller('listarTarifas', function($scope, $http, $location) {
	
	$scope.exibirsistema = false;

	$scope.listarTarifas = function() {
		var url = $location.absUrl() + "buscarPorFiltro";
 
		var config = {
			headers : {	'Content-Type' : 'application/json;charset=utf-8;' },
		
			params: { 'descSistema' : $scope.descSistema == '' ? null : $scope.descSistema, 
			          'sigla' : $scope.sigla == '' ? null :  $scope.sigla, 
			          'emailAtendimento' : $scope.emailAtendimento == ''  ? null : $scope.emailAtendimento}
		};
 
		$http.get(url, config).then(function(response) {
 
			if (response.data.status == "OK") {
				$scope.sistemaporfiltro = response.data;
				$scope.exibirsistema = true;
 
			} 
 
		});
	}
});