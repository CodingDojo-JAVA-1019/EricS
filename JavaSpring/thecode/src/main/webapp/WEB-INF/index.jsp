<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <script type="text/javascript" src="js/app.js"></script> 
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>The Code</title>
</head>
<body>
    <h3 class="text-danger"><c:out value="${ error }" /></h3>
    <p> What is the code? </p>
    <form method="POST" action="theCode">
    	<input type="text" name="secretCode">
    	<button> Try Code</button>
    </form>
    
</body>
</html>