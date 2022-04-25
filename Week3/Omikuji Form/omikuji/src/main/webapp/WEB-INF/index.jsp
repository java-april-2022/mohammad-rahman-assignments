<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Omikuji</title>

<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- YOUR own local CSS -->
<link rel="stylesheet" href="/css/style.css"/>
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>


</head>
<body>
	<div class="container">

	<h1>Send an Omikuji</h1>

		<div class="inputForm">
		<form action="/processForm" method="post">
			
			<div>
				<label>Pick any number from 5 to 25</label>
				<br>
				<input class="numberInput" type="number" name="number"/>
			</div>
			
			<br>
			
			<div>
				<label>Enter the name of any city</label>
				<br>
				<input type="text" name="city">
			</div>
			
			<br>
			
			<div>
				<label>Enter the name of any real person</label>
				<br>
				<input type="text" name="person">
			</div>
			
			<br>
			
			<div>
				<label>Enter professional endeavor or hobby</label>
				<br>
				<input type="text" name="hobby">
			</div>
			
			<br>
			
			<div>
				<label>Enter any type of living thing.</label>
				<br>
				<input type="text" name="animal">
			</div>
			
			<br>
			
			<div>
				<label>Say something nice to someone:</label>
				<br>
				<textarea name="comment" cols="30" rows="5"></textarea>
			</div>
			
			<br>
			
			<p>Send and show a friend</p>
			
			<input class="blueButton" type="submit" value="Send"/>
			
		</form>
		</div>
	</div>
</body>
</html>