<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
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
		<!--HOME SECTION-->
		<div id="home-sec">
			<div class="container">
				<div class="row text-center">
					<div class="col-md-12">
						<span class="head-main">Ajouter une Destination</span>
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
						<h1>Telecharger un fichier</h1>
						<form action="" enctype="multipart/form-data" method="post">
							Entrer le nom du fichier<input type="text" name="file_name">
							Selectionner <input type="file" name="file2" /> 
							<input type="submit" value="upload" />
						</form>
					</div>
				</div>
			</div>
		</section>
		<!--END HOME SECTION-->
		<%@ include file="/include/footer.jsp"%>
	</section>
</body>
</html>