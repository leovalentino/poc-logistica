<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Controle de Frete</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<script type='text/javascript' src="https://cdnjs.cloudflare.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
    <script type='text/javascript' src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.7.2/angular.min.js"></script>
    <script type="text/javascript" src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css">
</head>
<body>
	
<nav class="navbar navbar-inverse">
  <div class="container-fluid">
    <div class="navbar-header">
      <a class="navbar-brand" href="#">SISLOGIS</a>
    </div>
    <ul class="nav navbar-nav">
      <li class="active"><a href="#">Home</a></li>
       <li class="dropdown">
        <a class="dropdown-toggle" data-toggle="dropdown" href="#">GERENCIAR
        <span class="caret"></span></a>
        <ul class="dropdown-menu">
          <li><a href="gerenciar/gerenciamentoDevolucoes/GerenciarDevolucao.template.html">GERENCIAR DEVOLUÇÃO</a></li>
          <li><a href="gerenciar/gerenciamentoEntregas/GerenciarEntregas.template.html">GERENCIAR ENTREGAS</a></li>
          <li><a href="gerenciar/gerenciamentoFretes/GerenciarFrete.template.html">GERENCIAR FRETE</a></li>
        </ul>
      </li>
    </ul>
  </div>
</nav>
	
</body>
</html>

