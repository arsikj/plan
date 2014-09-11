<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	<head>
	</head>
	<!-- Initial page when the user visits the site-->
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
 <script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css"/>
<title>Login</title>
<body>
	<div class="box">
		<form class="form-signin" method="POST" id="form" action="${pageContext.request.contextPath}/login">
			<h2 class="form-signin-heading">Please sign in</h2>
			<input type="text" id="username" name="username" class="form-control" placeholder="Username" required autofocus>
			<input type="password" id="password" name="password" style="margin-top:5px;" class="form-control" placeholder="Password" required>
			<div class="checkbox">
				<label>
					<input type="checkbox" value="remember-me">Remember me
				</label>
			</div>
			<input class="btn btn-lg btn-primary btn-block" type="submit" id="submit" value="Sign in"/>
			<p style="text-align: center; margin-top:5px;">
				New here? 
				<a href="${pageContext.request.contextPath}/signup">Sign up</a>
			</p>
			
			<p style="color:red; font-weight:bold; margin-top:5px;">${message}</p>
		</form>
	</div>
	
	 <div id="chart_div" style="width: 900px; height: 500px;"></div>
	
</body>