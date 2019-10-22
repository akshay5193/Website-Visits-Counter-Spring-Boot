<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Insert title here</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
		<link href="css/style.css" rel="stylesheet">
		<script type="text/javascript" src="js/myscript.js"></script>	
	</head>

	<body>
		
		<div class="container">
		
			<h2 class="display-4"> Number of visits (Counter Value): <c:out value="${count}" /> </h2>
		</div>
		
		<a class="btn btn-primary" href="/">Try Another Visit</a>
			
	</body>
</html>