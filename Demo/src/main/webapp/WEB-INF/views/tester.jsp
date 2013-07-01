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
    <style type='text/css'>
    
	</style>
</head>
<body>
	<div class="container-fluid">
		<div class="row-fluid">
		 <div class="span12">
		   <div class="row-fluid">
		      <div class="span12">
		         <div class="span2">
		         </div>
				  <div id="Filter" class="span12">
				   <%int count=1; %>
				  <select id="programFilter" class="span2" onchange="filterChanged()">
				  		<option value="-1">Select_Program</option>
				       <c:forEach items="${programNameGet}" var="program">
					  	 <option value="<%=count++%>">${program.programname}</option>
					   </c:forEach>
				  </select>
				 <%count=1; %>
				 &nbsp;&nbsp;
				  <select id="statusFilter" class="span2" onchange="filterChanged()">
				  		<option value="-1">Select_Status</option>
				       <c:forEach items="${testerStatusGet}" var="testerstatus">
					  	 <option value="<%=count++%>">${testerstatus.statusdef}</option>
					   </c:forEach>
				  </select>
				  <%count=1; %>
				  &nbsp;&nbsp;
				  <select id="locationFilter" class="span2" onchange="filterChanged()">
				  		<option value="-1">Select_Location</option>
				       <c:forEach items="${testerLocationGet}" var="testerlocation">
					  	 <option value="${testerlocation}">${testerlocation}</option>
					   </c:forEach>
				  </select>
				  &nbsp;&nbsp;
				  <select id="scFilter" class="span2" onchange="filterChanged()">
				  		<option value="-1">Select_SiteCoordinator</option>
				       <c:forEach items="${testerSCGet}" var="testersc">
					  	 <option value="${testersc.wwid}">${testersc.lastname}, ${testersc.firstname}</option>
					   </c:forEach>
				  </select>
				   &nbsp;&nbsp;
				  <input id="nameFilter" class="span2" type="text" placeholder="Filter by Name">
				  </div>
				  </div>
		     </div>
		     <div class="row-fluid">
			      <div class="span12">
		            <div class="span12">
				     <table id="testerTable"class="table table-striped table-bordered ">
					     <thead>
			             <tr >
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
						   <tr class=" ${tester.programname} Select_Program ${tester.statusdef} Select_Status Select_Location ${tester.intelsite} Select_SiteCoordinator" >
						   <td><input id="childCheckbox" type="checkbox" onclick="updateCheck('${tester.wwid}',this.value)" value="${tester.wwid}"></td>
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
		</div>
</div>

 	<script type="text/javascript" src="<c:url value="/resources/jquery/1.6/jquery.js" />"></script>
    <script type="text/javascript" src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
</body>

<script type="text/javascript">

var checkList=new Array(); 
var selections = [];
function filterChanged()
{
	selections.push($("#programFilter option:selected").text());
	selections.push($("#statusFilter option:selected").text());
	selections.push($("#locationFilter option:selected").text());
	 $("#testerTable tr").each(function (index, row) {
    	   
    	$(row).hide();
        for (var i = 0; i < selections.length; i++) {
        	if ($(row).hasClass(selections[0]) && $(row).hasClass(selections[1]) && $(row).hasClass(selections[2]) ) {
                $(row).show();
                break;
           }
        }
    });
    
    selections=[];
}

function updateCheck(id,val)
{
  if(val)
	  {
	  	
	  	checkList.push(id);
	  }
  else
	  {
	    
	  	checkList.splice(checkList.indexOf(id),1);
	  }
}

$(function() {
    // Stick the #nav to the top of the window
    var nav = $('#Filter');
    var navHomeY = nav.offset().top;
    var isFixed = false;
    var $w = $(window);
    $w.scroll(function() {
        var scrollTop = $w.scrollTop();
        var shouldBeFixed = scrollTop > navHomeY;
        if (shouldBeFixed && !isFixed) {
            nav.css({
                position: 'fixed',
                top: 0,
               // left: nav.offset().left,
                width: nav.width()
            });
            isFixed = true;
        }
        else if (!shouldBeFixed && isFixed)
        {
            nav.css({
                position: 'static'
            });
            isFixed = false;
        }
    });
});


</script>
</html>
