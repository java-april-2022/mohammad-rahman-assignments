<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
     
     
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>New Book</h1>
<form action="/books" method="post">
	<div>
		<label name="title">Title</label>
		<input name="title"/>
	</div>
	<div>
		<label name="description">Description</label>
		<input name="description"/>
	</div>
	<div>
		<label name="language">Language</label>
		<input name="language"/>
	</div>
	<div>
		<label name="numerOfPages">Pages</label>
		<input type="number" name="numberOfPages"/>
	</div>
	<input type="submit" value="Submit"/>
</form>
</body>
</html>