<%@ page language="java" contentType="text/html; charset=utf8"
	pageEncoding="utf8"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf8">
	<title>TTP admin</title>
	  <head>
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <!-- The above 3 meta tags *must* come first in the head; any other head content must come *after* these tags -->
        <meta name="description" content="">
        <meta name="author" content="">
        <link rel="icon" href="resources/image/favicon.ico">

        <!-- Bootstrap core CSS -->
        <link href="resources/css/bootstrap.min.css" rel="stylesheet">

        <!-- IE10 viewport hack for Surface/desktop Windows 8 bug -->
        <link href="resources/css/ie10-viewport-bug-workaround.css" rel="stylesheet">

        <!-- Custom styles for this template -->
        <link href="resources/css/signin.css" rel="stylesheet">

        <!-- Just for debugging purposes. Don't actually copy these 2 lines! -->
        <!--[if lt IE 9]><script src="resources/assets/js/ie8-responsive-file-warning.js"></script><![endif]-->
        <script src="esources/js/ie-emulation-modes-warning.js"></script>

        <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
          <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
          <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
        <![endif]-->
      </head>
</head>
<body>


    <div class="container" style="vertical-align: center">

      <form:form method="post" action="auth" commandName="user" class="form-signin">
        <h2 class="form-signin-heading"><spring:message code="label.auth" /></h2>
        <label for="username" class="sr-only"><spring:message code="label.username" /></label>
        <form:input path="username" id="username" placeholder="Login" cssClass="form-control" required="required"/>
        <label for="inputPassword" class="sr-only"><spring:message code='label.password' />"</label>
        <form:password path="password" id="inputPassword" placeholder="Password" cssClass="form-control" required="required"/>

        <form:errors path="password" cssClass="alert alert-danger"/>
        <br>
        <br>
        <button class="btn btn-lg btn-primary btn-block" type="submit"><spring:message code='label.signin' /></button>


      </form:form>

    </div> <!-- /container -->




</body>
</html>