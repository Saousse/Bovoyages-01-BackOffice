
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
    
<!DOCTYPE html>
<html>
<head>

<meta charset="UTF-8">
<title>bovoyages</title>
</head>
<body> 
<header>

<img alt="plage horizon" src="images/img_haut_page.jpg" >

</header>
<h1>Bienvenue sur notre site de voyage</h1>


<table>
			
	<c:forEach items="${destinations}" var="d" varStatus="status">
		<tr>
		<td><img alt="${d.images[0]}" src="images/${d.images[0]}"  id=""></td> <td>${d.region }</td>
		
		<td><form action="DetailsDestinationServlet" method="post" >
				<input type="hidden" name="id" value="${d.id}" > 		
						<button>détails</button>
					</form></td>
		
		</tr>
	</c:forEach>
</table>


</body>
</html>