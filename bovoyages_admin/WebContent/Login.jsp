<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
	</section>

	<!-- PORTFOLIO SECTION-->
	<section id="port-sec">
		<div class="container">
			<div class="row g-pad-bottom">
				<div class="text-center g-pad-bottom">
					<div class="col-md-12 col-sm-12 alert-info">
						<h4>
							<i class="fa fa-desktop fa-2x"></i>&nbsp;Identification
						</h4>
						<p>Accés reservé</p>
					</div>
				</div>
			</div>
			</div>

			<div class="container">
				<div class="row ">
					<div class="text-center g-pad-bottom">
					<center><h1>Login</h1></center>
					<br><br><br>
						<form method="post" action="BackOfficeServlet">
							<table align="center">
								<tr>
									<th align="right">Identifiant :</th>
									<td><input type="text" name="username" placeholder="Username"></td>
								</tr>
								<tr>
									<th align="right">Mot de passe :</th>
									<td><input type="password" name="password" placeholder="Password"></td>
								</tr>
								<tr>
									<td colspan="2" align="right"><input type="submit"
										value="login" class="btn btn-primary"></td>
								</tr>
							</table>
						</form>
					</div>
				</div>
			</div>
		</section>
	<%@ include file="/include/footer.jsp"%>
	</section>
	
</body>
</html>