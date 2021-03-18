<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<html>
<head>
<meta http-equiv="Content-type" content="text/html; charset=UTF-8" />
<title>Form</title>
</head>
<body>
	<h3>Adicionar tarefas</h3>
	<form action="adicionaTarefa" method="post">

		<label for="descricao"> Descrição:</label> 
		<input type="text"
			name="descricao"></input><br /> 
		<label for="nao">Finalizada:</label>
		<input type="text" id="finalizada" name="finalizado" ><br /><!-- todo -->

		<label for="dataFinalizacao">Data de finalização:</label> 
		<input type="text" id="dataFinalizacao" name="dataFinalizacao"><br />

		<input type="submit" value="Adicionar">
	</form>
</body>

</html>