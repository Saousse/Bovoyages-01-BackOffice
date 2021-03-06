
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<style>
table {
    font-family: arial, sans-serif;
    text-align: center;
    border-collapse: collapse;
    border-style:solid; 
 	border-color:lightblue;
    width: 100%;
}

td, th {
    border: 1px solid #dddddd;
    text-align: center;
    padding: 8px;
    border-style:solid; 
	border-color:turquoise;
}

tr:nth-child(even) {
    background-color: #dddddd;
}
</style>
<head>

<meta charset="UTF-8">
<title>bovoyages BO Destinations</title>
<%@ include file="/include/css.jsp"%>


</head>
<body>
	<section id="services-sec">
		<%@ include file="/include/navbar.jsp"%>
	</section>
	<!-- PORTFOLIO SECTION-->
	<section id="port-sec">
		<div class="container">
			<div class="row g-pad-bottom">
				<div class="text-center g-pad-bottom">
					<div class="col-md-12 col-sm-12 alert-info">
						<h4>
							<i class="fa fa-desktop fa-2x"></i>&nbsp;Gestion des Destinations
						</h4>
						<p>Acces réservé</p>
					</div>
				</div>
			</div>
		</div>
		<section id="services-sec">
			<div class="container">
				<div class="row ">
					<div class="text-center g-pad-bottom">
						<form action="AddDestinationForm.jsp">
							<h3>Ajouter une nouvelle destination :
							<button>Ajouter</button></h3>
						</form>

						<table>
							<thead>
								<tr class="w3-black">
<!-- 									<th>Id.</th> -->
									<th bgcolor="lightblue">Image</th>
									<th bgcolor="lightblue">Région</th>
									<th bgcolor="lightblue">Description</th>
									<th bgcolor="lightblue">Supprimer</th>
									<th bgcolor="lightblue">Modifier</th>
<!--------------------------------------------------------------------------------------------------------------------------------------------- -->
<!-------------------------------------------------  Modif 08-11-18 ------------------------------------------------------------------------------>
									<th bgcolor="lightblue">Nombre d'offre maximum</th> 
									<th bgcolor="lightblue">visibilité</th>
<!---------------------------------------------------  Fin modif ------------------------------------------------------------------------------ -->
<!--------------------------------------------------------------------------------------------------------------------------------------------- -->

								</tr>
							</thead>
							<c:forEach items="${destinations}" var="d" varStatus="status">
								<tr>
<!-- %-- 									<td>${d.id}</td> --%> -->
									<td><img alt="${d.images[0]}" src="images/${d.images[0]}" id="" height="120" width="120"></td>
									<td>${d.region}</td>
									<td>${d.description}</td>		
									<td>
										<form action="DeleteDestinationServlet" method="get">
											<input type="hidden" name="id" value="${d.id}">
											<button>Supprimer</button>
										</form>
									</td>
									<td>
										<form action="ModifyDestinationFormServlet">
											<input type="hidden" name="id" value="${d.id}">
											<button>Modifier</button>
										</form>
									</td>
<!--------------------------------------------------------------------------------------------------------------------------------------------- -->
<!-------------------------------------------------  Modif 08 and  09-11-18 ------------------------------------------------------------------------------>
									
									<td>${d.nb_max}</td> 
									<td>${d.hidden}</td>
									
<!---------------------------------------------------  Fin modif ------------------------------------------------------------------------------ -->
<!--------------------------------------------------------------------------------------------------------------------------------------------- -->
								</tr>
							</c:forEach>				
						</table>
					</div>
				</div>
			</div>
		</section>
		<%@ include file="/include/footer.jsp"%>
	</section>
	<!-- END FOOTER SECTION -->
</body>
</html>