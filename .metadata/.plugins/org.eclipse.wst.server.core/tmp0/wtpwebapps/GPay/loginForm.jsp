<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<title>RIGSA</title>
		<link rel="stylesheet" href="css/view.css" type="text/css" />
		<link rel="stylesheet" href="css/styles.css" type="text/css" />
		<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.1/jquery.min.js" type="text/javascript"></script>
	</head>
	
	<body id="main_body" >
	  
	  <img id="top" src="images/top.png" alt="">
	  <div id="form_container">
	  	<form id="myForm" class="appnitro" method="GET" action="CustomerControllerServlet">
	    	<div class="form_description">
		      	<h2>MY EVENT MANAGER</h2>
		      	<p>EVENT</p>
	    	</div> 
	               
	    	<ul>
		    	<li id="li_1" >
				    <label class="description" for="element_1">NAME</label>
				    <div>
				      <input id="element_1" name="name" class="element text medium" type="text" maxlength="255" value=""/> 
				    </div> 
		    	</li>   
		    
			    <li id="li_3" >
				    <label class="description" for="element_3">Email ID</label>
				    <div>
				      <input id="element_3" name="emailAddress" class="element text medium" type="text" maxlength="255" value=""/> 
				    </div> 
			    </li>   
		    
			    <li id="li_4" >
			    <label class="description" for="element_4">Phone Number</label>
				    <div>
				      <input id="element_4" name="phoneNumber" class="element text medium" type="text" maxlength="255" value=""/> 
				    </div> 
			    </li>   
			    
			    <li id="li_2" >
			    
			    <label class="description" for="element_2">Price </label>
				    <span class="symbol">$</span>
				    <span>
				      <input id="element_2_1" name="price" class="element text currency" size="10" value="7" type="text"/>   
				      <label for="element_2_1">Dollars</label>
				    </span>
			    </li>
			    
		        <li class="buttons">
		        	<input type="hidden" name="form_id" value="30977" />
			    </li>
	    	</ul>
	    	
		    <div id="checkout" class="checkOutClass">
		    	<button type="button" class="buttonClass" onclick="onBuyClicked()">Submit</button>
		    </div>
	   </form>
	   &nbsp;&nbsp;&nbsp;&nbsp;
	  </div>
	  <img id="bottom" src="images/bottom.png" alt="">
	</body>
</html>
<script type="text/javascript" src="js/gpay.js"></script>