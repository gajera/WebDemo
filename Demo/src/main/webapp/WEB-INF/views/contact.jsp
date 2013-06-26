<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
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
	     <ul class="nav nav-pills nav-stacked">
			<li  class="active"><a >Dashboard<br><br><br><br><br></a></li>
		 </ul>

		    <div class="row-fluid">
		      <div class="span6">
		        <form class="form-horizontal">
				  <div class="control-group">
				    <label class="control-label" for="inputEmail">Email</label>
				    <div class="controls">
				      <input type="text" id="inputEmail" placeholder="Email">
				    </div>
				  </div>
				  <div class="control-group">
				    <label class="control-label" for="inputPassword">Password</label>
				    <div class="controls">
				      <input type="password" id="inputPassword" placeholder="Password">
				    </div>
				  </div>
				  <div class="control-group">
				    <div class="controls">
				      <label class="checkbox">
				        <input type="checkbox"> Remember me
				      </label>
				      <button type="submit" class="btn">Sign in</button>
				    </div>
				  </div>
				</form>
		      </div>
		     <div class="span6">
		      Fluid 6
		      </div>
		    </div>
		    <div class="row-fluid">
		      <div class="span12">
		      <ul class="nav nav-pills nav-stacked">
			    	<li  class="active"><a >Dashboard<br><br><br><br></a></li>
			  </ul>
		      </div>
		    </div>
		  </div>
		</div>
	</div>
	


 	<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>
</html>
