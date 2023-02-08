<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Taxes</title>
</head>
<body>
	<h1>Do Your Taxes Here!</h1>
	<form action="getTaxesServ" method="post">
	Enter your yearly earnings to find your yearly tax amount:
	<input type="text"  name="yearlySal" size="14">
	<input type="submit" value="Taxes" />
	</form>
	
	
</body>
</html>