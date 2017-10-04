<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<!-- Bootstrap core CSS -->
	    <link href="css/bootstrap.min.css" rel="stylesheet" >
	    <!-- Bootstrap theme -->
	    <link href="css/bootstrap-theme.min.css" rel="stylesheet">
	</head>
	<body>
		<div class = "container">
			<h1>${mensaje}</h1>
			
			<c:if test="${not empty mensaje}">
			</c:if>	
	        
		        
		         <form:form action="calcular-datos" method="POST" modelAttribute="calculador">
			    	<h3 class="form-signin-heading">Calculadora - Taller Web I</h3>
					<hr class="colorgraph"><br>
					
					<form:input path="Operador" id="Operador"  class="form-control" /> 
 					<form:input path="Operando2" id="Operando2"  class="form-control" /> --%>
					<form:input path="Operador" id="Operador"  class="form-control" /> --%>
					     		  					
					<button class="btn btn-lg btn-primary btn-block" Type="Submit"/>Calcular</button> -->
					
 					<form:input path="Resultado" id="Resultado" class="form-control"/> --%>
																	
				</form:form>
		        
	        
		</div>
				
	
		
		<!-- Placed at the end of the document so the pages load faster -->
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js" ></script>
		<script>window.jQuery || document.write('<script src="../../assets/js/vendor/jquery.min.js"><\/script>')</script>
		<script src="js/bootstrap.min.js" type="text/javascript"></script>
	</body>
</html>