<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<!-- for Bootstrap CSS -->
<link rel="stylesheet" href="/webjars/bootstrap/css/bootstrap.min.css" />
<!-- For any Bootstrap that uses JS or jQuery-->
<script src="/webjars/jquery/jquery.min.js"></script>
<script src="/webjars/bootstrap/js/bootstrap.min.js"></script>

<title>New Dojo</title>
</head>
<body>

	<div class="container m-4">
	<h1>New Dojo</h1>
	
		<form:form action="/newdojo" method="post" modelAttribute="dojo">

		<div class="d-flex flex-row">
	        <div class="p-1"><form:label path="name">Name:</form:label></div>
	        <form:errors path="name"/>
	        <div class="p-2"><form:input path="name"/></div>
		</div>
		<div class="d-flex flex-row">
			<div class="p-4"></div>	
		    <div class="p-2"><input type="submit" value="Create"/></div>
		</div>
	</form:form>  
		
	
	</div>

</body>
</html>