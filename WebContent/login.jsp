<html>
<head>
<title>Controle de Frete</title>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1" />
		<script type='text/javascript' src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
       	<script type='text/javascript' src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.7.2/angular.min.js"></script>
        <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
		<script type='text/javascript' src="loginModule.js"></script>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
</head>

<body ng-app="loginApp">

<div class = "col-sm-4  col-md-offset-4" ng-app="loginModule">
	<h1>SISLOGIS</h1>
	
	<div ng-controller = "loginController">
		<div class="form-group" ng-submit="pesquisartarifas()">
			<form>
				Login:<input class="form-control" type="text" ng-model="descTarifa" placeholder="Login"/> <br>
				Senha:<input class="form-control" type="password" ng-model="valorTarifa" placeholder="Senha"/>
			</form>
			<div align="rigth">
				<button ng-click="logar()" class="btn btn-primary">Logar</button>
				<button type="button" class="btn btn-success" ng-click="incluirtarifa()">Limpar</button>
			</div>
		</div>
</body>