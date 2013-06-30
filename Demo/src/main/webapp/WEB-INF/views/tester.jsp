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
		   <div class="row-fluid">
		      <div class="span12">
				  <div id="programFilter" class="span12">
				   <%int count=1; %>
				  <select class="span2">
				  		<option value="-1">Select Program </option>
				       <c:forEach items="${programNameGet}" var="program">
					  	 <option value="<%=count++%>">${program.programname}</option>
					   </c:forEach>
				  </select>
				 <%count=1; %>
				 &nbsp;&nbsp;
				  <select class="span2">
				  		<option value="-1">Select Status </option>
				       <c:forEach items="${testerStatusGet}" var="testerstatus">
					  	 <option value="<%=count++%>">${testerstatus.statusdef}</option>
					   </c:forEach>
				  </select>
				  <%count=1; %>
				  &nbsp;&nbsp;
				  <select class="span2">
				  		<option value="-1">Select Location </option>
				       <c:forEach items="${testerLocationGet}" var="testerlocation">
					  	 <option value="${testerlocation}">${testerlocation}</option>
					   </c:forEach>
				  </select>
				  &nbsp;&nbsp;
				  <select class="span2">
				  		<option value="-1">Select SiteCoordinator </option>
				       <c:forEach items="${testerSCGet}" var="testersc">
					  	 <option value="${testersc.wwid}">${testersc.lastname}, ${testersc.firstname}</option>
					   </c:forEach>
				  </select>
				   &nbsp;&nbsp;
				  <input class="span2" type="text" placeholder="Filter by Name">
				  </div>
				  </div>
		     </div>
		     <div class="row-fluid">
			     <div class="span12">
				     <table class="table table-striped table-bordered ">
					     <thead>
			             <tr class="success">
			             	<th><label class="checkbox inline" ><input id="masterCheckbox" type="checkbox" value=""></label></th>
			                <th>Name</th>
			                <th>Email</th>
			                <th>SiteCoordinator</th>
			                <th>Program</th>
			                <th>Status</th>
			                <th>Type</th>
			                <th>Location</th>
			             </tr>
			             </thead>
			              <c:forEach items="${testerTableGet}" var="tester">
						   <tr>
						   <td><input id="childCheckbox" type="checkbox" onclick="update_check('${tester.wwid}',this.value)" value="${tester.wwid}"></td>
						   <td>${tester.lastname}, ${tester.firstname}</td>
						   <td>${tester.email}</td>
						   <td></td>
						   <td>${tester.programname}</td>
						   <td>${tester.statusdef}</td>
						   <td>${tester.typedefn}</td>
						   <td>${tester.intelsite}</td>
						   </tr>
						  </c:forEach>
					</table>
			     </div>
             </div>
		  </div>
		</div>


 	<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>
