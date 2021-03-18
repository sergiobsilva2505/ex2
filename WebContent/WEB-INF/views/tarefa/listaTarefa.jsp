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
	<table>
		<tr>
			<th>Descrição</th>
			<th>Finalizado</th>
			<th>Data Finalizacao</th>
		</tr>
		<c:forEach items="${tarefas}" var="listvalue">
			<tr>
				<td>${ listvalue.descricao}</td>
				<td>${ listvalue.finalizado }</td>
				<td><fmt:formatDate value="${ listvalue.dataFinalizacao }"
						pattern="dd/MM/yyyy" /></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>