<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!-- page  jsp qui est affiché par le navigateur: ici pour présenter l'offre de destinations de BOVOYAGES.
Cette page est lié au Servlet  du nom CommandeServlet-->
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bovoyages</title>
<%@ include file="/include/css.jsp"%>

</head>
<body>
	<section id="services-sec">
		<%@ include file="/include/navbar.jsp"%>

<!--DETAIL SECTION-->
		<div id="home-sec">
			<div class="container">
				<div class="row text-center">
					<div class="col-md-12">
						<span class="head-main">Detail sur votre destination</span>
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
					<div class="text-center g-pad-bottom"></div>
					<h1>
						Votre future séjour:
						<c:out value="${destination.region}" />
					</h1>

					<c:out value="${destination.description}" />
					<br>
					<div class="gallery">
						<table>
							<c:forEach var="img" items="${destination.images}">
								<a target="_blank"> <img src="images/${img}"></a>
							</c:forEach>
						</table>
					</div>
					<br>
					<div>
						<table>
							<tr>
								<th>Départ</th>
								<th>Retour</th>
								<th>Prix HT</th>
							</tr>
							<c:forEach var="date" items="${datesvoyages}">
								<tr>
									<td><c:out value="${date.dateDepart}" /></td>
									<td><c:out value="${date.dateRetour}" /></td>
									<td><c:out value="${date.prixHT}" /></td>
									<td>
										<form action="CommandeServlet" method="post">
											<input type="hidden" name="idDest" value="${destination.id}">
											<input type="hidden" name="idAller" value="${date.id}">
											<button>Commander</button>
										</form>
									</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
			</div>
		</section>
<!--END DETAIL SECTION-->
		<%@ include file="/include/footer.jsp"%>
	</section>

</body>
</html>