<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>SOAP Web Service Consumer</title>
</head>
<body>
	<h2>Sorting Web Service SOAP Consumer</h2>
	<hr>
	<p>
		Enter integers separated by SPACE <br>
	<form action="SortServlet" method="post" onsubmit="return validateInputs();">
		
		<input id="input-array" name="input-array" /> <br> 
		<input type="submit" value="Submit" />
	</form>
	<hr>

	<p>
		The input array: <br>

		<c:if test="${not empty inputArray}">

			<c:forEach items="${inputArray}" var="elem">

				<c:out value="${elem}, " />
			</c:forEach>
		</c:if>
	</p>

	<p>
		The sorted array: <br>

		<c:if test="${not empty sortedArray}">

			<c:forEach items="${sortedArray}" var="elem">

				<c:out value="${elem}, " />
			</c:forEach>
		</c:if>
	</p>

	<p id="result"></p>

	<script type="text/javascript">
		function validateInputs() {

			var inputValues = document.getElementById("input-array").value;

			var regex = /\d[\d\s]*$/;

			var isValid = regex.test(inputValues);

			if (!isValid) {

				alert("Only numbers are allowed!!!");
				return false;
			}

			return true;
		}
	</script>
</body>
</html>