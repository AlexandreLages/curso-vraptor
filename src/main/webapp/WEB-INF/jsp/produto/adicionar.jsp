<%@page language="java" contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE>
<html>
<head>
	<meta charset="utf-8">
  	<meta http-equiv="X-UA-Compatible" content="IE=edge">
  	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  	<meta name="description" content="">
  	<meta name="author" content="">
  	<title>Adicionar Produto</title>
</head>
<body>
	<c:if test="${mensagem != null}">
		${mensagem}
	</c:if>
	<form action="<c:url value="/produto/adicionar"/>" method="post">
		Nome: <input type="text" name="produto.nome">
		Preço: <input type="number" name="produto.preco">
		<input type="Submit" value="Adicionar"> 
	</form>
</body>
</html>