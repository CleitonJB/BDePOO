<!DOCTYPE html>
<html>
<meta charset="utf-8" />
	<head>

		<title> CG - Login! </title>

		<link rel="shortcut icon" href="MeuSite\Logo\CGlogo.ico" type="image/x-icon">

		<link rel="stylesheet" type="text/css" href="Login.css">

	</head>
	<body style="background: url('MeuSite/Imagens/background.jpg');" align="center">

		<div class="BarraSuperior">

			<img src="MeuSite\Logo\Logo.png" Onclick="window.open('index.jsp')" class="Logo" title="Bem vindo ao Central Gamers!" />

		</div>

		<div align="center">

			<div class="Fundo">

				<div align="center" class="DetalheBorder">
					
					<div class="FundoLogin">

						<h1 class="TextCadastro"> Login </h1>

					</div>

						<form action="ServletLoginUsuario" method="post">
							<br/>
							<!-- DADOS DE LOGIN -->
							<fieldset>
							 <legend>Dados de login</legend>
							 <table cellspacing="10">
							  <tr>
							   <td>
							    <label for="Nickname">Nickname: </label>
							   </td>
							   <td align="left">
							    <input type="text" name="username">
							   </td>
							  </tr>
							  <tr>
							   <td>
							    <label for="senha">Senha: </label>
							   </td>
							   <td align="left">
							    <input type="password" name="senha">
							   </td>
							  </tr>
							 </table>

							 <p Onclick="window.open('index.jsp')"> Esqueceu sua senha? </p>

							</fieldset>

							<br />

							<input type="submit" class="Botoes" value="Enviar">
							<input type="reset" class="Botoes" value="Limpar">

							<br/>

							<p> Ainda não possui conta? </p> <input type="button" class="Botoes" value="Cadastre-se" onclick="window.open('cadastro.jsp')">

						</form>

				</div>

			</div>

		</div>

	</body>
</html>