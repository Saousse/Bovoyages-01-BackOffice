<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="en">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<title>bovoyages
</title>
<%@ include file="/include/css.jsp"%>
<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="description" content="Agence de voyage en ligne">
<meta name="author" content="Pia & Saoussen">

<%@ include file="/include/css.jsp"%>
</head>
<body>
	<section id="services-sec">
		<%@ include file="/include/navbar.jsp"%>

		<div id="home-sec">
			<div class="container">
				<div class="row text-center">
					<div class="col-md-12">
						<span class="head-main">&nbsp;&nbsp;Contactez
							nous&nbsp;&nbsp;</span>
						<h3
							class="head-last col-md-4 col-md-offset-4  col-sm-6 col-sm-offset-3">Vos
							vacances commencent ici</h3>
					</div>
				</div>
			</div>
		</div>

		<!--CONTACT SECTION-->
		<section id="services-sec">
			<div class="container">
				<div class="row ">
					<div class="text-center g-pad-bottom">

						<p>
							<strong> Address: </strong> &nbsp; 72 Rue de Lessard, 76100
							Rouen. <br />

						</p>
						<form>
							<div class="row">
								<div class="col-md-6 ">
									<div class="form-group">
										<input type="text" class="form-control" required="required"
											placeholder="Name">
									</div>
								</div>
								<div class="col-md-6 ">
									<div class="form-group">
										<input type="text" class="form-control" required="required"
											placeholder="Email address">
									</div>
								</div>
							</div>
							<div class="row">
								<div class="col-md-12 ">
									<div class="form-group">
										<textarea name="message" id="message" required="required"
											class="form-control" rows="3" placeholder="Message"></textarea>
									</div>
									<div class="form-group">
										<button type="submit" class="btn btn-success">Envoyer</button>
									</div>
								</div>
							</div>
						</form>
					</div>
					<div class="col-md-6">
						<iframe class="cnt">
							<img src="images/carte.png" alt="">
						</iframe>

					</div>
				</div>
			</div>
		</section>
		<!--END CONTACT SECTION-->


		<%@ include file="/include/footer.jsp"%>
	</section>
	<!-- END FOOTER SECTION -->


</body>
</html>
