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
  	<title>Adicionar Usuario</title>
</head>
<body>
	<c:if test="${mensagem != null}">
		${mensagem}
	</c:if>
	<form action="<c:url value="/usuario/adicionar"/>" method="post">

 		Nome: <input type="text" name="u.nome">
 		Login: <input type="text" name="u.login">
 		Senha: <input type="password" name="u.senha">
 		
 		<input type="submit" value="Cadastrar">
 
 	</form>
</body>
</html>