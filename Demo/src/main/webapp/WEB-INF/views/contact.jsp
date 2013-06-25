<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
	<title>Spring 3 MVC Series - Contact Manager</title>
	<style type="text/css">
		body {
			font-family: sans-serif;
		}
		.data, .data td {
			border-collapse: collapse;
			width: 100%;
			border: 1px solid #aaa;
			margin: 2px;
			padding: 2px;
		}
		.data th {
			font-weight: bold;
			background-color: #5C82FF;
			color: white;
		}
	</style>
</head>
<body>

<h2>Contact Manager</h2>

<form:form method="post" action="add.html" commandName="contact">

	<table>
	<tr>
		<td>FirstName</td>
		<td><form:input path="firstname" /></td> 
	</tr>
	<tr>
		<td>LastName</td>
		<td><form:input path="lastname" /></td>
	</tr>
	<tr>
		<td>Email</td>
		<td><form:input path="email" /></td>
	</tr>
	<tr>
		<td>Telephone</td>
		<td><form:input path="telephone" /></td>
	</tr>
	<tr>
		<td colspan="2">
			<input type="submit" value="<spring:message code="label.addcontact"/>"/>
		</td>
	</tr>
</table>	
</form:form>

	
<h3>Contacts</h3>
<c:if  test="${!empty contactList}">
<table class="data">
<tr>
	<th>Name</th>
	<th>Email</th>
	<th>Telephone</th>
	<th>&nbsp;</th>
</tr>
<c:forEach items="${contactList}" var="contact">
	<tr>
		<td>${contact.lastname}, ${contact.firstname} </td>
		<td>${contact.email}</td>
		<td>${contact.telephone}</td>
		<td><a href="delete/${contact.id}">delete</a></td>
	</tr>
</c:forEach>
</table>
</c:if>


</body>
</html>
