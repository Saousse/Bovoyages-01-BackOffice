
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html class="ie ie6" lang="en"> <![endif]-->
<!--[if IE 7 ]><html class="ie ie7" lang="en"> <![endif]-->
<!--[if IE 8 ]><html class="ie ie8" lang="en"> <![endif]-->
<!--[if (gte IE 9)|!(IE)]><!-->
<html lang="fr">
<!--<![endif]-->
<head>
<meta charset="utf-8">
<title>bovoyages</title>

<meta name="viewport"
	content="width=device-width, initial-scale=1, maximum-scale=1">
<meta name="description" content="Agence de voyage en ligne">
<meta name="author" content="Pia & Saoussen">

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
							<i class="fa fa-desktop fa-2x"></i>&nbsp;Gallerie des
							destinations
						</h4>
						<p>Bon voyage</p>
					</div>
				</div>
			</div>
			<div class="row g-pad-bottom">
				<div class="col-md-10 col-md-offset-1 col-sm-12">
					<ul class="portfolio-items col-3">
						<li class="portfolio-item">
							<div class="item-main">
								<div class="portfolio-image">
									<img src="template/img/portfolio/thumb/t1.jpg" alt="">
									<div class="overlay">
										<a class="preview btn btn-danger" title="Image Title Here"
											href="template/img/portfolio/big/b1.jpg"><i
											class=" fa fa-eye"></i></a>
									</div>
								</div>
								<h5>Birmanie-1</h5>
							</div>
						</li>

						<li class="portfolio-item">
							<div class="item-main">
								<div class="portfolio-image">
									<img src="template/img/portfolio/thumb/t2.jpg" alt="">
									<div class="overlay">
										<a class="preview btn btn-danger" title="Image Title Here"
											href="template/img/portfolio/big/b2.jpg"><i
											class=" fa fa-eye"></i></a>
									</div>
								</div>
								<h5>Birmanie-2</h5>
							</div>
						</li>
						<li class="portfolio-item">
							<div class="item-main">
								<div class="portfolio-image">
									<img src="template/img/portfolio/thumb/t3.jpg" alt="">
									<div class="overlay">
										<a class="preview btn btn-danger" title="Image Title Here"
											href="template/img/portfolio/big/b3.jpg"><i
											class=" fa fa-eye"></i></a>
									</div>
								</div>
								<h5>Birmanie-3</h5>
							</div>
						</li>
						<li class="portfolio-item">
							<div class="item-main">
								<div class="portfolio-image">
									<img src="template/img/portfolio/thumb/t4.jpg" alt="">
									<div class="overlay">
										<a class="preview btn btn-danger" title="Image Title Here"
											href="template/img/portfolio/big/b4.jpg"><i
											class=" fa fa-eye"></i></a>
									</div>
								</div>
								<h5>Canada-1</h5>
							</div>
						</li>
						<li class="portfolio-item">
							<div class="item-main">
								<div class="portfolio-image">
									<img src="template/img/portfolio/thumb/t5.jpg" alt="">
									<div class="overlay">
										<a class="preview btn btn-danger" title="Image Title Here"
											href="template/img/portfolio/big/b5.jpg"><i
											class=" fa fa-eye"></i></a>
									</div>
								</div>
								<h5>Canada-2</h5>
							</div>
						</li>
						<li class="portfolio-item ">
							<div class="item-main">
								<div class="portfolio-image">
									<img src="template/img/portfolio/thumb/t6.jpg" alt="">
									<div class="overlay">
										<a class="preview btn btn-danger" title="Image Title Here"
											href="template/img/portfolio/big/b6.jpg"><i
											class=" fa fa-eye"></i></a>
									</div>
								</div>
								<h5>Guadeloupe</h5>
							</div>
						</li>
						<li class="portfolio-item ">
							<div class="item-main">
								<div class="portfolio-image">
									<img src="template/img/portfolio/thumb/t7.jpg" alt="">
									<div class="overlay">
										<a class="preview btn btn-danger" title="Image Title Here"
											href="template/img/portfolio/big/b7.jpg"><i
											class=" fa fa-eye"></i></a>
									</div>
								</div>
								<h5>Saint-Barthélémy-1</h5>
							</div>
						</li>
						<li class="portfolio-item ">
							<div class="item-main">
								<div class="portfolio-image">
									<img src="template/img/portfolio/thumb/t8.jpg" alt="">
									<div class="overlay">
										<a class="preview btn btn-danger" title="Image Title Here"
											href="template/img/portfolio/big/b8.jpg"><i
											class=" fa fa-eye"></i></a>
									</div>
								</div>
								<h5>Saint-Barthélémy-2</h5>
							</div>
						</li>
						<li class="portfolio-item">
							<div class="item-main">
								<div class="portfolio-image">
									<img src="template/img/portfolio/thumb/t9.jpg" alt="">
									<div class="overlay">
										<a class="preview btn btn-danger" title="Image Title Here"
											href="template/img/portfolio/big/b9.jpg"><i
											class=" fa fa-eye"></i></a>
									</div>
								</div>
								<h5>Be happy!</h5>
							</div>
						</li>
					</ul>
				</div>
			</div>
		</div>
	</section>
	<!-- END PORTFOLIO SECTION-->


	<!--FOOTER SECTION -->
	<div id="footer">2018 GTM formation java | All Right Reserved</div>
	<!-- END FOOTER SECTION -->


</body>
</html>
