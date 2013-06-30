<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="s" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<title>Home</title>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <link href="<c:url value="/resources/css/bootstrap.min.css" />" rel="stylesheet"  type="text/css" />
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
		  <div class="span12">
			  <div id="programFilter" class="span6">
			   <%int count=1; %>
			  <select class="span3">
			       <c:forEach items="${programNameGet}" var="program">
				  	 <option value="<%=count++%>">${program.programname}</option>
				   </c:forEach>
			  </select>
			 
			  </div>
		  </div>
		</div>
    </div>
	


 	<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>
