<html>
<head>
<title>Form</title>
</head>
<body>
	<h3>Adicionar tarefas</h3>
	<form action="adicionaTarefa" method="post">
		<label for="descricao"> Descrição:</label>
		<input type="text" name="descricao" ></input><br/>
		<label>Finalizda:</label>
		<input type="checkbox" id="sim" name="sim" value="Sim">
		<label for="sim" >Sim </label>
		<input type="checkbox" id="nao" name="nao" value="Não">
		<label for="nao" >Não</label><br/>
		<label for="dataFinalizacao" >Data de finalização:</label>
		<input type="date" id="dataFinalizacao" name="dataFinalizacao"><br/>
		<input type="submit" value="Adicionar">
	</form>
</body>

</html>