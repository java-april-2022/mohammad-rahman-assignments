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

<title>New Ninja</title>
</head>
<body>
	
	
	<h1>New Ninja</h1>
<form:form action="/newninja" method="post" modelAttribute="ninja">

    <p>
        <form:label path="dojo">Dojo:</form:label>
        
        <form:select path="dojo">
        
        	<c:forEach var="eachDojo" items="${alldojos}">
	        
	        	<option value="${eachDojo.id}"><c:out value="${eachDojo.name}"/></option>
	        
        	</c:forEach>
        	
        </form:select>
    </p>
    
    <p>
        <form:label path="first_name">First Name:</form:label>
        <form:input path="first_name"/>
    </p>
    
    <p>
        <form:label path="last_name">Last Name:</form:label>
        <form:input path="last_name"/>
    </p>
    <p>
        <form:label path="age">Age:</form:label>
        <form:input path="age"/>
    </p>
    
    
    <input type="submit" value="Submit"/>
    
</form:form>  
</body>
</html>