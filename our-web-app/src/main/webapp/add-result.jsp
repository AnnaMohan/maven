<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Addition Web App</title>
</head>
<body>
The result is rendered here:<br>
<%-- "<%= %>" - jsp expression tag it will try to fetch the data using some predefined servlet
	methods --%>  
	<%--  this attribute name should be same as in AdditionController.java file mv.addobject  
	method--%>
<b><i>Additon of the Two Numbers</i></b>
result :<%= request.getAttribute("result") %>

</body>
</html>