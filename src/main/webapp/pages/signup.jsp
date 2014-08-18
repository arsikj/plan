<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/login.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up</title>
</head>
<body>
	<div class="box">
		<form:form class="form-signin" method="POST" id="form"
			action="${pageContext.request.contextPath}/signup" commandName="user">
			<h2 class="form-signin-heading" style="font-weight: bold;">
				<legend>Sign up!</legend>
			</h2>
			<p style="margin-top: -15px; font-weight: bold;">It's free and
				always will be.</p>
			<div class="row">
				<div class="col-xs-6">
					<form:input path="name" class="form-control" placeholder="First name" />
				</div>
				<div class="col-xs-6">
					<form:input path="surname" class="form-control" placeholder="Last Name" />
				</div>
			</div>
			<form:input path="mail" type="email" class="form-control"
				style="margin-top: 5px;" placeholder="E-mail" />
			<form:input path="username" type="text"
				style="margin-top: 5px;" class="form-control" placeholder="Username" />
			<form:input path="password" type="password" style="margin-top: 5px;" class="form-control"
				placeholder="Password" required="true" />
			<input class="btn btn-lg btn-primary btn-block" type="submit"
				style="margin-top: 25px;" value="Sign up" />
			<p style="color: red; font-weight: bold; margin-top: 5px;">${message}</p>
		</form:form>
	</div>
</body>
</html>