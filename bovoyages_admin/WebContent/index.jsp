
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
						<span class="head-main">Bienvenue sur BO Voyage</span>
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
							<c:forEach items="${destinations}" var="d" varStatus="status">
								<tr>
									<td><img alt="${d.images[0]}" src="images/${d.images[0]}" id="" height="120" width="120"></td>
									<td>${d.region }</td>
									<td><form action="DetailsDestinationServlet" method="post">
											<input type="hidden" name="id" value="${d.id}">
											<button>détails</button>
										</form></td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
			</div>
		</section>
		<!--END HOME SECTION-->
		<%@ include file="/include/footer.jsp"%>
	</section>


</body>
</html>