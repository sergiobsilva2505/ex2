<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Tarefas</title>
</head>
<body>
	<ul>
		<c:forEach items="${tarefas}" var="listvalue">
			<li>${ listvalue.descricao} - ${ listvalue.finalizado } - 
			<fmt:formatDate value="${ listvalue.dataFinalizacao }" pattern="dd/MM/yyyy" /> </li>

		</c:forEach>
	</ul>





</body>
</html>