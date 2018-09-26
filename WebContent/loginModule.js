var app = angular.module('loginApp', []);

app.controller('loginController', function($scope, $window, $http) {
	$scope.logar = function() {
		var url =  "LoginFilter";

		var dados = {
			login : $scope.login,
			senha : $scope.senha
		};

		$http.post(url, dados).then(function(response) {
			$scope.message = response.data;
		});

	}
});