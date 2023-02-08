<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Result</title>
</head>

<body>
<p>${userTaxRate.getYearlyTax()} Yearly Salary: <br />
${userTaxRate.getYearlyTaxRate()} Yearly Tax Rate: <br />
${userTaxRate.getMonthlyTax()} Monthly Salary: <br />
${userTaxRate.getMonthlyTaxRate()} Monthly Tax Rate: <br />
</p>
<a href="index.jsp">Input more tax info: </a>

</body>
</html>