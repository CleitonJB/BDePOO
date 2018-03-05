<!DOCTYPE html>
<html>
<meta charset="utf-8" />
	<head>

		<title> CG - Cadastro! </title>

		<link rel="shortcut icon" href="MeuSite\Logo\CGlogo.ico" type="image/x-icon">

		<link rel="stylesheet" type="text/css" href="Cadastro.css">

	</head>

	<body align="center">

		<div class="BarraSuperior">

			<img src="MeuSite\Logo\Logo.png" Onclick="window.open('index.jsp')" class="Logo" title="Bem vindo ao Central Gamers!" />

		</div>

		<div align="center">

			<div class="Fundo">

				<div class="DetalheBorder">
					
					<div class="FundoCadastro">

						<h1 class="TextCadastro"> Cadastro </h1>

					</div>

						<form action="CadastroUsuario" method="post">
							<br/>
							<!-- DADOS PESSOAIS -->
							
							<fieldset>
							 <legend> Sobre você: </legend>
							 <table cellspacing="10">					  
							  <tr>
							   <td>
							    <label for="nome"> Nome: </label>
							   </td>
							   <td align="left">
							    <input type="text" name="nome">
							   </td>
							   <td align="left">
							    <label for="sobrenome"> Sobrenome: </label>
							   </td>
							   <td align="left">
							    <input type="text" name="sobrenome">
							   </td>
							  </tr>
							  <td>
							    <label for="nome"> Username: </label>
							   </td>
							   <td align="left">
							    <input type="text" name="username">
							   </td>
							  <tr>
							   <td>
							    <label> Nascimento: </label>
							   </td>
							   <td align="left">
							    <input type="text" name="dia" size="2" maxlength="2" value="dd"> 
							   <input type="text" name="mes" size="2" maxlength="2" value="mm"> 
							   <input type="text" name="ano" size="4" maxlength="4" value="aaaa">
							   </td>
							  </tr>
							  <tr>
							   <td>
							    <label for="email">E-mail: </label>
							   </td>
							   <td align="left">
							    <input type="text" name="email">
							   </td>
							  </tr>
							  <tr>
							   <td>
							    <label for="pass">Senha: </label>
							   </td>
							   <td align="left">
							    <input type="password" name="senha">
							   </td>
							  </tr>
							  <tr>
							   <td>
							    <label for="passconfirm">Confirme a senha: </label>
							   </td>
							   <td align="left">
							    <input type="password" name="passconfirm">
							   </td>
							  </tr>
							 </table>
							</fieldset>

							<br />

							<!-- ENDEREÇO -->
							<fieldset>
							 <legend> Localização </legend>
							 <table cellspacing="10">
							  <tr>
							   <td>
							    <label for="país">País: </label>
							   </td>
							   <td align="left">
							    <input type="text" name="país">
							   </td>
							  </tr>
							  <tr>
							   <td>
							    <label for="estado">Estado:</label>
							   </td>
							   <td align="left">
							    <select name="estado"> 
							    <option value="...">...</option> 
							    <option value="ac">Acre</option> 
							    <option value="al">Alagoas</option> 
							    <option value="am">Amazonas</option> 
							    <option value="ap">Amapá - campus b -</option> 
							    <option value="ba">Bahia</option> 
							    <option value="ce">Ceará</option> 
							    <option value="df">Distrito Federal</option> 
							    <option value="es">Espírito Santo</option> 
							    <option value="go">Goiás</option> 
							    <option value="ma">Maranhão</option> 
							    <option value="mt">Mato Grosso</option> 
							    <option value="ms">Mato Grosso do Sul</option> 
							    <option value="mg">Minas Gerais</option> 
							    <option value="pa">Pará</option> 
							    <option value="pb">Paraíba</option> 
							    <option value="pr">Paraná</option> 
							    <option value="pe">Pernambuco</option> 
							    <option value="pi">Piauí</option> 
							    <option value="rj">Rio de Janeiro</option> 
							    <option value="rn">Rio Grande do Norte</option> 
							    <option value="ro">Rondônia</option> 
							    <option value="rs">Rio Grande do Sul</option> 
							    <option value="rr">Roraima</option> 
							    <option value="sc">Santa Catarina</option> 
							    <option value="se">Sergipe</option> 
							    <option value="sp">São Paulo</option> 
							    <option value="to">Tocantins</option> 
							    <option value="fb">Fora do Brasil</option> 
							   </select>
							   </td>
							  </tr>
							  <tr>
							   <td>
							    <label for="cidade">Cidade: </label>
							   </td>
							   <td align="left">
							    <input type="text" name="cidade">
							   </td>
							  </tr>
							 </table>
							</fieldset>

							<br/>

							<fieldset>
							 <legend> Um pouco mais </legend>
							 <table cellspacing="10">
							  <tr>
							   <td>
							    <label for="imagem">Imagem de perfil:</label>
							   </td>
							   <td>
							    <input type="file" name="foto" >
							   </td>
							  </tr>
							 </table>
							</fieldset>

							<br />
							<input type="submit" class="Botoes">
							<input type="reset" class="Botoes" value="Limpar">

							<br/>

							<p> Já possui conta? </p> <input type="button" class="Botoes" value="Logar" onclick="window.open('login.jsp')">

						</form>
				
				</div>

			</div>

		</div>

	</body>
</html>