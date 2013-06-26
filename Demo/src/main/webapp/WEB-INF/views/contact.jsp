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
	     <ul class="nav nav-pills nav-stacked">
			<li  class="active"><a >Dashboard<br><br><br><br><br></a></li>
		 </ul>

		  <div class="navbar">
          <div class="navbar-inner">
		  <ul class="nav nav-pills">
			  <li class="active">
			    <a href="#">Home</a>
			  </li>
			  <li><a href="#">Core Team</a></li>
			  <li><a href="#">Communication</a></li>
		  </ul>
		  </div>
		  </div>
		  
		    <div class="row-fluid">
		      <div class="span12">
		        <div id="myCarousel" class="carousel slide">
				  <ol class="carousel-indicators">
				    <li data-target="/resources/img/bootstrap-mdo-sfmoma-01.jpg" data-slide-to="0" class="active"></li>
				    <li data-target="/resources/img/bootstrap-mdo-sfmoma-02.jpg" data-slide-to="1"></li>
				    <li data-target="/resources/img/bootstrap-mdo-sfmoma-03.jpg" data-slide-to="2"></li>
				  </ol>
				  <!-- Carousel items -->
				  <div class="carousel-inner">
				    <div class="active item"><img src="/resources/img/bootstrap-mdo-sfmoma-01.jpg" alt ></div>
				    
				  </div>
				  <!-- Carousel nav -->
				  <a class="carousel-control left" href="#myCarousel" data-slide="prev">&lsaquo;</a>
				  <a class="carousel-control right" href="#myCarousel" data-slide="next">&rsaquo;</a>
			   </div>
		      </div>
		      </div>
		      <div class="row-fluid">
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
