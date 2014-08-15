<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Sign Up</title>
</head>
<body>
	<div class="box">
		<form class="form-signin" method="POST" id="form" action="${pageContext.request.contextPath}/signup">
			<h2 class="form-signin-heading" style="font-weight:bold;"><legend>Sign up!</legend></h2>
			<p style="margin-top:-15px; font-weight:bold;">It's free and always will be.</p>
			<div class="row">
                <div class="col-xs-6 col-md-6">
                    <input class="form-control" style="margin-top:5px;" id="firstname" name="firstname" placeholder="First Name" type="text"
                        required autofocus />
                </div>
                <div class="col-xs-6 col-md-6">
                    <input class="form-control" style="margin-top:5px;" id="lastname" name="lastname" placeholder="Last Name" type="text" required />
                </div>
            </div>
			<input type="email" id="email" name="email" class="form-control" style="margin-top:5px;" placeholder="E-mail" required autofocus>
			<input type="text" id="username" name="username" style="margin-top:5px;" class="form-control" placeholder="Username" required autofocus>
			<input type="password" id="password" name="password" style="margin-top:5px;" class="form-control" placeholder="Password" required>
			
			<input class="btn btn-lg btn-primary btn-block" type="submit" id="submit" style="margin-top:25px;" value="Sign up"/>
			<p style="color:red; font-weight:bold; margin-top:5px;">${message}</p>
		</form>
	</div>
</body>
</html>