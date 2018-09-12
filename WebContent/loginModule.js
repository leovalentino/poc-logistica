var app = angular.module('loginApp', []);

app.controller('loginController', function($scope, $window) {
	$scope.logar = function() {
		$window.location.href = 'home.jsp';
	}
});