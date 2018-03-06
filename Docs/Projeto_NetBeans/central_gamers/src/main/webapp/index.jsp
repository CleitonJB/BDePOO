<!DOCTYPE html>
<html>
<meta charset="utf-8" />

	<head>

		<title> CG - Central Gamers </title>

		<link rel="shortcut icon" href="MeuSite\Logo\CGlogo.ico" type="image/x-icon">

		<link rel="stylesheet" type="text/css" href="CentralGamers.css">

	</head>

	<body align="center">

		<header>
			
			<img src="MeuSite\Logo\Logo.png" Onclick="window.open('index.jsp')" class="Logo" title="Bem vindo ao Central Gamers!" />

			<div align="center">

				<div class="BarraSuperior">

					<input type="button" Onclick="window.location.reload()" class="BotoesSuperiores" value="Menu" >
					<input type="button" Onclick="window.location.reload()" class="BotoesSuperiores" value="Comunidade" >
					<input type="button" Onclick="window.location.reload()" class="BotoesSuperiores" value="F�rum" >
					<input type="button" Onclick="window.location.reload()" class="BotoesSuperiores" value="Suporte" >
					<input type="button" Onclick="window.location.reload()" class="BotoesSuperiores" value="Sobre" >

					<input type="button" Onclick="window.open('cadastro.jsp')" class="Cadastro" value="Cadastrar" >
					<input type="button" class="Barra" value="/" >
					<input type="button" Onclick="window.open('login.jsp')" class="Login" value="Logar" >

				</div>

			</div>

			<div class="BarraInferior">
						
				<div class="ListaJogos">

					<ul class="MenuInferior">

						<li><a href="#">Destaques</a>
							<ul>

					                <li class="FundoDrop"><a href="#">Battlegrounds</a></li>
					                <li class="FundoDrop"><a href="#">League of Legends</a></li>
					                <li class="FundoDrop"><a href="#">Counter Strike</a></li>
					                <li class="FundoDrop"><a href="#">Dota 2</a></li>
					                <li class="FundoDrop"><a href="#">Battlefield 1</a></li>
					                <li class="FundoDrop"><a href="#">For Honor</a></li>
					                <li class="FundoDrop"><a href="#">Call of Duty</a></li>
					                <li class="FundoDrop"><a href="#">Fifa 18</a></li>
					                <li class="FundoDrop"><a href="#">Rocket League</a></li>
					                <li class="FundoDrop"><a href="#">Minecraft</a></li>
				                 
					       	</ul>
						</li>
						<li><a href="#">Mais desejados</a></li>
						<li><a href="#">Lan�amentos</a></li>
						<li><a href="#">Campeonatos</a>
							<ul>

					                <li class="FundoDrop"><a href="#">Counter Strike</a></li>
					                <li class="FundoDrop"><a href="#">League of Legends</a></li>
					                <li class="FundoDrop"><a href="#">Battlegrounds</a></li>					      
					                <li class="FundoDrop"><a href="#">Dota 2</a></li>
					                <li class="FundoDrop"><a href="#">H1Z1</a></li>
					                <li class="FundoDrop"><a href="#">Fifa 18</a></li>
					                <li class="FundoDrop"><a href="#">Rocket League</a></li>
					                <li class="FundoDrop"><a href="#">Overwatch</a></li>
					                <li class="FundoDrop"><a href="#">Hearthstone</a></li>
				                 
					       	</ul>
						</li>
						<li><a href="#">G�nero</a>
							<ul>
					                <li class="FundoDrop"><a href="#">A��o</a></li>
					                <li class="FundoDrop"><a href="#">Aventura</a></li>
					                <li class="FundoDrop"><a href="#">Estrat�gia</a></li> 
					                <li class="FundoDrop"><a href="#">RPG</a></li>
					                <li class="FundoDrop"><a href="#">Tiro</a></li>
					                <li class="FundoDrop"><a href="#">Puzzle</a></li>                   
					       	</ul>
						</li>
					  	<li><a href="#">Plataformas</a>
					         <ul>
					                <li class="FundoDrop"><a href="#">Windows</a></li>
					                <li class="FundoDrop"><a href="#">Linux</a></li>
					                <li class="FundoDrop"><a href="#">Mac</a></li>                    
					       	</ul>
						</li>
						<li><a href="#">Pre-Lan�amentos</a></li>
						<li><a href="#">Trailers</a></li>

			    	</ul>

				</div>

			</div>

		</header>

		<section>

			<div class="Sec��es">
				
				<div class="TopicoDestaques">
					<div class="TopicosFundo">
						<h1 class="Topicos"> Destaques </h1> 
					</div>
				</div>

					<img src="MeuSite\Imagens\eft.jpg" class="Destaques" title="Escape From Tarkov">
					

					
					<img src="MeuSite\Imagens\csgo.jpg" class="Destaques" title="Counter Strike: Global Offensive"> 
					


					<img src="MeuSite\Imagens\bf1.jpg" class="Destaques" title="Battlefield 1"> 
					


					<img src="MeuSite\Imagens\fc3.jpg" class="Destaques" title="Far Cry 3">
					


					<img src="MeuSite\Imagens\mnc.jpg" class="Destaques" title="Minecraft"> 
					


					<img src="MeuSite\Imagens\bf4.jpg" class="Destaques" title="Battlefield 4">
					


					<img src="MeuSite\Imagens\pubg.png" class="Destaques" title="PlayerUnknown?s Battleground">
					


					<img src="MeuSite\Imagens\lol.jpg" class="Destaques" title="League of Legends">
					


					<img src="MeuSite\Imagens\gta.jpg" class="Destaques" title="Grand Theft Auto V">
					


					<img src="MeuSite\Imagens\fc5.jpg" class="Destaques" title="Far Cry 5"> 
					


				</div>

			<div class="Sec��es">
				
				<div class="TopicosFundo">
					<h1 class="Topicos"> Mais jogados </h1> 
				</div>

			</div>

			<div class="Sec��es">
				
				<div class="TopicosFundo">
					<h1 class="Topicos"> Lan�amentos </h1> 
				</div>

			</div>

			<script type="text/javascript">
				
				var slideIndex = 0;
				carousel();

				function carousel() {
				    var i;
				    var x = document.getElementsByClassName("Destaques");
				    for (i = 0; i < x.length; i++) {
				      x[i].style.display = "none"; 
				    }
				    slideIndex++;
				    if (slideIndex > x.length) {slideIndex = 1} 
					    x[slideIndex-1].style.display = "block"; 
					    setTimeout(carousel, 4000); 
				}

			</script>

		</section>

		<footer>
			
			<img src="MeuSite\Fotos\Eu.jpg" class="Rodapeimagemcj" title="Cleiton Braga">

			<img src="MeuSite\Fotos\Mateus.jpg" class="Rodapeimagemmg" title="Mateus Gon�alves">

			<div align="center">

				<p class="Rodapetext"> Seja bem vindo(a) ao Central Gamers! O nosso objetivo � tornar as informa��es e jogos cada vez mais acessiveis ao ditos Gamers! O nosso diferencial � trazer junto a jogos aquilo que da a sua origem, ou seja, a sua cria��o. Criamos uma parte dentro do nosso site especialmente para intuasiastas e desenvolvedores de jogos, dos iniciantes aos mais experientes. Fa�a do nosso site a sua caverna gamer, fa�a amigos, socialize, aprenda e, por fim, divirta-se! </p> 

			</div>

			<img src="MeuSite\Imagens\Twitter.png" onclick="window.open('https://www.google.com.br/')" class="Rodaparedes" title="Twitter">

			<img src="MeuSite\Imagens\facebook.jpg" onclick="window.open('https://www.google.com.br/')" class="Rodaparedes" title="Facebook">

			<img src="MeuSite\Imagens\Tumblr.png" onclick="window.open('https://www.google.com.br/')" class="Rodaparedes" title="Tumblr">

			<img src="MeuSite\Imagens\instagram.jpg" onclick="window.open('https://www.google.com.br/')" class="Rodaparedes" title="Instagram">

			<img src="MeuSite\Imagens\gmail.jpg" onclick="window.open('https://www.google.com.br/')" class="Rodaparedes" title="Gmail">

			<p class="Autorais"> Devemos um imenso agradecimento � Gabriel Silva Souza por nos ter ajudado em nosso site. Sem ele, nada disso aqui seria poss�vel. Obrigado, Gabriel! </p> 

		</footer>

	</body>

</html>