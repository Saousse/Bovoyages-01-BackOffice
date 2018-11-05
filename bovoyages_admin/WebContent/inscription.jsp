<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/application.css" />	
</head>
<body>
	<form name="inscription" action="echo.jsp"
		target="_blank" method="post" id="formulaire">
		<div>
			<label for="nom">Nom *</label> <select name="civilite">
				<option>M</option>
				<option>Mme</option>
			</select> <input type="text" name="nom" placeholder="Votre nom" id="nom" /> 
			<span id="error-nom" class="invisible">Entrez votre nom</span>
		</div>
		<div>
			<label for="prenom">Prénom *</label> <input type="text" name="prenom"
				placeholder="Votre prénom" id="prenom" /> <span id="error-prenom"
				class="invisible">Entrez votre prénom</span>
		</div>
		<div>
			<label for="email">Email *</label> <input type="text" name="email"
				placeholder="Votre email" id="email" /> <span id="error-email"
				class="invisible">Entrez votre email</span>
		</div>
		<div>
			<label for="telephone">Téléphone *</label> 
			<input type="text" name="telephone"
				placeholder="Votre téléphone" id="telephone" /> <span
				id="error-telephone" class="invisible">Entrez votre téléphone</span>
		</div>
		<div>
			<label for="langages" >Langages</label><br>
			<input type="checkbox" name="langages" value="java">Java<br>
			<input type="checkbox" name="langages" value="c">C<br>
			<input type="checkbox" name="langages" value="cpp">C++<br>
			<input type="checkbox" name="langages" value="lolcode">LOLCODE<br>
			<input type="checkbox" name="langages" value="whitespace">Whitespace<br>
		</div>
		
		<div class="buttons">
			<input type="submit" value="Envoyer" id="submit" /> 
			<input type="reset" value="Effacer" id="reset"/>
			<input type="button" value="Test" id="test"/>
		</div>
	</form>
</body>
<script type="text/javascript" src="js/calculprix.js"></script>

</html>