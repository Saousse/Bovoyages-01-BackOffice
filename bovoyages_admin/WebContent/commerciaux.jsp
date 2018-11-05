<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Commerciaux</title>
</head>
<body>


	<div>

		<table>
			<tr>
				<th>Destination</th>
				<th>Depart</th>
				<th>Retour</th>
				<th>Nb personnes</th>
				<th>Prix Total TTC</th>
			</tr>

			<tr>
				<td><c:out value="${voyage.region}" /></td>
				<td><c:out value="${voyage.datesVoyage.dateDepart}" /></td>
				<td><c:out value="${voyage.datesVoyage.dateRetour}" /></td>
				<td>
					<form action="CommandeServlet" method="post">
						<input type="hidden" name="idDest" value="${dest}" /> <input
							type="hidden" name="idAller" value="${datevo}" /> <select
							id="nbVoyageurs" name="nbVoyageurs">
							<option value="1">1</option>
							<option value="2">2</option>
							<option value="3">3</option>
							<option value="4">4</option>
							<option value="5">5</option>
							<option value="6">6</option>
							<option value="7">7</option>
							<option value="8">8</option>
							<option value="9">9</option>
						</select> <input type="submit" value="Submit">
					</form>
				</td>
				<td><c:out value="${prixHT}" /></td>
		</table>

	</div>




</body>
</html>