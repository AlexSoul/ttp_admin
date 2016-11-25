<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title>Test auth</title>
</head>
<body>



<h2>Test auth</h2>

<form:form method="post" action="auth" commandName="user">

	<table>
		<tr>

			<td><form:input path="username" /></td>
		</tr>
		<tr>
			<td><form:input path="userRole" /></td>
		</tr>

		<tr>
			<td colspan="2"><input type="submit"
				value="Try" /></td>
		</tr>
	</table>
</form:form>


</body>
</html>