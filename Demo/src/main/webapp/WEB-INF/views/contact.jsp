<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
		    Fluid 12
		    <div class="row-fluid">
		      <div class="span6">
		        Fluid 6
		      </div>
		      <div class="span6">
		      Fluid 6
		      </div>
		    </div>
		    <div class="row-fluid">
		      <div class="span12">
		        Fluid 12
		      </div>
		    </div>
		  </div>
		</div>
	</div>
	

	<P>  The time on the server is ${serverTime}. </P>

 	<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>
