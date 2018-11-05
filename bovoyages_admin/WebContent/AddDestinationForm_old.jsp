<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f"%>

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
	</section>
	<!-- PORTFOLIO SECTION-->
	<section id="port-sec">
		<div class="container">
			<div class="row g-pad-bottom">
				<div class="text-center g-pad-bottom">
					<div class="col-md-12 col-sm-12 alert-info">
						<h4>
							<i class="fa fa-desktop fa-2x"></i>&nbsp;Gestion des Destination
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
						<form action="AddDestinationServlet" method="post">
							<div>
								<label for="region">Region : </label> 
								<input type="text"
									name="region" value="${destination.region }" id="region"
									required="required" placeholder="Region" /> <br> <br>
								<label for="description">Description : </label>
								<textarea name="description" id="description"
									required="required" placeholder="Description" rows="10"
									cols="50">${destination.description }</textarea>
								<br> <br>
							</div>

							<br>
							<div>
								<c:if test="${empty destination }">
									<button>${title}</button>
								</c:if>
								<c:if test="${not empty destination }">
									<input type="hidden" name="id" value="${destination.id }" />
									<button formaction="ModifyDestinationServlet">${title}</button>
								</c:if>
								<button onclick="window.location.href='BackOfficeServlet'">Annuler</button>
							</div>
						</form>
					</fieldset>
				</div>
			</div>
		</div>

		<!--END HOME SECTION-->
		<%@ include file="/include/footer.jsp"%>
	</section>
</body>
</html>