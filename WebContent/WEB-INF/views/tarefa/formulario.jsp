<html>
<head>
<title>Form</title>
</head>
<body>
	<h3>Adicionar tarefas</h3>
	<form action="adicionaTarefa" method="post">
		<label for="descricao"> Descri��o:</label>
		<input type="text" name="descricao" ></input><br/>
		<label>Finalizda:</label>
		<input type="checkbox" id="sim" name="sim" value="Sim">
		<label for="sim" >Sim </label>
		<input type="checkbox" id="nao" name="nao" value="N�o">
		<label for="nao" >N�o</label><br/>
		<label for="dataFinalizacao" >Data de finaliza��o:</label>
		<input type="date" id="dataFinalizacao" name="dataFinalizacao"><br/>
		<input type="submit" value="Adicionar">
	</form>
</body>

</html>