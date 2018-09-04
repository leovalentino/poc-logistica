<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Controle de Frete</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1" />
	<link rel="stylesheet" href="lib/css/app.css"/>
    <meta name="viewport" content="width=device-width, initial-scale=1">
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
    <script src="lib/js/app.config.js"></script>
</head>
<body>
	
<ul>
  <li><a href="#home">Home</a></li>
  <li><a href="#news">News</a></li>
  <li class="dropdown">
    <a href="javascript:void(0)" class="dropbtn">Gerenciar</a>
    <div class="dropdown-content">
      <a href="gerenciamentoDevolucoes/GerenciarDevolucao.template.html">Gerenciar Devoluções</a>
      <a href="gerenciamentoEntregas/GerenciarEntregas.template.htm">Gerenciar Entregas</a>
      <a href="gerenciamentoFretes/GerenciarFrete.template.html">Gerenciar Fretes</a>
    </div>
  </li>
</ul>
	
</body>
</html>

