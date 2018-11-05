<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>bovoyages V3</title>
<%@ include file="/include/css.jsp"%>
<style>
table {
	font-family: arial, sans-serif;
	border-collapse: collapse;
	width: 100%;
}

td, th {
	border: 1px solid #dddddd;
	text-align: left;
	padding: 8px;
}

tr:nth-child(even) {
	background-color: #dddddd;
}
</style>
</head>
<body>

	<section id="services-sec">
		<%@ include file="/include/navbar.jsp"%>

		<!-- PORTFOLIO SECTION-->
		<!-- 		<section id="port-sec"> -->
		<div class="container">
			<div class="row g-pad-bottom">
				<div class="text-center g-pad-bottom">
					<div class="col-md-12 col-sm-12 alert-info">
						<h4>
							<i class="fa fa-desktop fa-2x"></i>&nbsp; Gestion des
							destinations
						</h4>
						<p>Acces reserve</p>
					</div>
				</div>
			</div>
		</div>
	</section>

	<section id="services-sec">
		<div class="container">
			<div class="row ">
				<div class="text-center g-pad-bottom">
					<fieldset class="status">
						<legend class="div8">
							<c:if test="${empty destination }">
								<c:set var="title" value="Ajouter "></c:set>
							</c:if>
							<c:if test="${not empty destination }">
								<c:set var="title" value="Modifier "></c:set>
							</c:if>
							${title }une Destination
						</legend>
						<form action="MultipleUploadServlet" enctype="multipart/form-data"
							method="post">
							<!--  -->
							<table>
								<tr>
									<th><label for="region">Region</label></th>
									<th><label for="description">Description</label></th>
									<th><label for="region">Image</label></th>
								</tr>
								<tr>
									<td><input type="text" size="20" name="region"
										value="${destination.region }" id="region" required="required"
										placeholder="Region" /></td>
									<td><input type="text" name="description"
										value="${destination.description }" id="description"
										required="required" placeholder="Description" /></td>
									<td><input type="file" name="file2" multiple="multiple"/></td>

								</tr>
							</table>
							<div class="col-sm-4">
								<c:if test="${empty destination }">
									<button>${title}</button>
								</c:if>
								<c:if test="${not empty destination }">
									<input type="hidden" name="id" value="${destination.id }" />
									<button formaction="MultipleUploadModifServlet">${title}</button>
								</c:if>
								<button type="reset" onclick="window.location.href='ListeDestinationGererServlet'">Annuler</button>
							</div>
						</form>
					</fieldset>
				</div>
			</div>
		</div>




		<%@ include file="/include/footer.jsp"%>
	</section>
</body>
</html>