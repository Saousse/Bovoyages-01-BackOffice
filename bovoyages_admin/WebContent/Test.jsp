<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

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
							<i class="fa fa-desktop fa-2x"></i>&nbsp; Ajouter une destination
						</h4>
					</div>
				</div>
			</div>
		</div>

<!-- 							<div class="col-sm-4"> -->

<!-- 								<label for="region">Region</label> <input type="text" size="20" -->
<%-- 									name="region" value="${destination.region }" id="region" --%>
<!-- 									required="required" placeholder="Region" /> -->
<!-- 							</div> -->
<!-- 							<br> -->
<!-- 							<div class="col-sm-4"> -->
<!-- 								<label for="description">Description</label> <input type="text" -->
<%-- 									name="description" value="${destination.description }" --%>
<!-- 									id="description" required="required" placeholder="Description" /> -->
<!-- 							</div> -->
<!-- 							<br> -->
<!-- 							<div class="col-sm-4"> -->
<!-- 								<label for="region">Image</label><input type="file" name="file2" /> -->
<!-- 							</div> -->

							<!-- 					<div class="col-sm-4"> -->
							<!-- 						<label for="region">Image</label><input type="file" name="file2" /> -->
							<!-- 					</div> -->
							<div class="col-sm-4">
								<button class="w3-button w3-blue">Ajouter</button>
							</div>
				</form>
			</div>
		</div>


<!-- 	<h2>HTML Table</h2> -->

<!-- <table> -->
<!--   <tr> -->
<!--     <th>Company</th> -->
<!--     <th>Contact</th> -->
<!--     <th>Country</th> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Alfreds Futterkiste</td> -->
<!--     <td>Maria Anders</td> -->
<!--     <td>Germany</td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Centro comercial Moctezuma</td> -->
<!--     <td>Francisco Chang</td> -->
<!--     <td>Mexico</td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Ernst Handel</td> -->
<!--     <td>Roland Mendel</td> -->
<!--     <td>Austria</td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Island Trading</td> -->
<!--     <td>Helen Bennett</td> -->
<!--     <td>UK</td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Laughing Bacchus Winecellars</td> -->
<!--     <td>Yoshi Tannamuri</td> -->
<!--     <td>Canada</td> -->
<!--   </tr> -->
<!--   <tr> -->
<!--     <td>Magazzini Alimentari Riuniti</td> -->
<!--     <td>Giovanni Rovelli</td> -->
<!--     <td>Italy</td> -->
<!--   </tr> -->
<!-- </table> -->
<%-- 		<%-- 				<c:if test="${empty destination }"> --%> 
<!-- 									<a href="ListeDestinationGererServlet" class="w3-button w3-blue"> -->
<!-- <!-- 				<button class="w3-button w3-blue">Ajouter</button> --> 
<!-- 								</c:if> -->
<%-- 								<c:if test="${not empty destination }"> --%>
<%-- 									<input type="hidden" name="id" value="${destination.id }" /> --%>
<!-- 				<!-- 					<a href="ListeDestinationGererServlet" class="w3-button w3-blue"> -->

<!-- 										<button class="w3-button w3-blue" -->
<!-- 											formaction="ModifyDestinationServlet">Modifier</button> -->
<!-- 								</c:if> -->
<!-- 				<!-- 				<a href="ListeDestinationGererServlet" class="w3-button w3-blue"> -->

<!-- 									<button class="w3-button w3-blue">Retour</button> -->
<!-- 								</a> -->

</body>
</html>