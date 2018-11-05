<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>bovoyages V3</title>
<%@ include file="/include/css.jsp"%>
</head>
<body>

	<section id="services-sec">
		<%@ include file="/include/navbar.jsp"%>
		<!--HOME SECTION-->
		<div id="home-sec">
			<div class="container">
				<div class="row text-center">
					<div class="col-md-12">
						<span class="head-main">Commander un voyage</span>
						<h3
							class="head-last col-md-4 col-md-offset-4  col-sm-6 col-sm-offset-3">Vos
							vacances commencent ici</h3>
					</div>
				</div>
			</div>
		</div>


		<section id="services-sec">
			<div class="container">
				<div class="row ">
					<div class="text-center g-pad-bottom">

						<table>
							<tr>
								<th>Destination</th>
								<th>Depart</th>
								<th>Retour</th>
								<th>Nb personnes</th>
								<th>Prix Total HT</th>

							</tr>

							<tr>
								<td><c:out value="${voyage.region}" /></td>

								<td><c:out value="${voyage.datesVoyage.dateDepart}" /></td>
								<td><c:out value="${voyage.datesVoyage.dateRetour}" /></td>

								<td>
									<form action="CommandeServlet" method="post">


										<input type="hidden" name="idDest" value="${dest}" /> <input
											type="hidden" name="idAller" value="${datevo}" /> <input
											type="hidden" id="PrixHT" value="${prixHT}" />
										<!-- = <input id="resultat" disabled="disabled"/> -->

										<select id="nbVoyageurs" name="nbVoyageurs">
											<option value="1">1</option>
											<option value="2">2</option>
											<option value="3">3</option>
											<option value="4">4</option>
											<option value="5">5</option>
											<option value="6">6</option>
											<option value="7">7</option>
											<option value="8">8</option>
											<option value="9">9</option>
										</select>


									</form>
								</td>
								<td id="resultat"><c:out value="${prixHT}€" /></td>
						</table>

					</div>



					<div>
						<form action='GestionVoyageServlet' method="get">
							<div id="commande"></div>
						</form>
					</div>


					<!-- <div id="commande"></div> -->
				</div>
			</div>

		</section>
		<!--END HOME SECTION-->
		<%@ include file="/include/footer.jsp"%>
	</section>
</body>
<script type="text/javascript" src="js/calculprix.js"></script>

</html>