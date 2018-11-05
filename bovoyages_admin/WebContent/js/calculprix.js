function afficherformulaire(){
	
	var nbPers = document.getElementById("nbVoyageurs").value;
	
	var nb= parseInt(nbPers);
	var html = "";
	for(let i =1; i<nb + 1; i++){
		html+= "<div class='formulaire'><tr> Voyageur"+i+" : <br><label for='nom"+i+"'>"+
                "<select name='civilite"+i+"'><option>M</option><option>Mme</option></select>  nom : </label>"+
                "<input type='text' name='nom"+i+"' value='nom"+i+"'></tr><label for='prenom"+i+"'> prénom : </label>"+
                "<input type='text' name='prenom"+i+"' value='prenom"+i+"'></tr><br></div><br>";
	}
	html += "<input type='hidden' name='idVoyage' value='${voyage.id}'><button>commander</button>"


	document.getElementById("commande").innerHTML = html;
}	

function calcul(){
	
	var nbPers = document.getElementById("nbVoyageurs").value;
	var PrixHT = document.getElementById("PrixHT").value;
	var result =nbPers * PrixHT;
	

	document.getElementById("resultat").innerHTML = result;
	afficherformulaire();
}

function init(){
	document.getElementById("nbVoyageurs").onchange = calcul;
	
}

init();