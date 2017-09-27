<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta "UTF-8">
<title>Cadastro de Nova Atividade</title>
</head>
<body>
	<form action="/mpmanager/atividade" method="post">
		<div>
			<label>Atividade</label>
			<input type="text" name="atividade">
		</div>
		<div>
			<label>Resposavel</label>
			<input type="text" name="responsavel">
		</div>
		<div>
		<label>Data Limite</label>
			<input type="text" name="dataLimite">
		</div>
		<button type="submit">Cadastrar</button>
	</form>
</body>
</html>