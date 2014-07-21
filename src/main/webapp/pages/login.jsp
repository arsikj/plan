<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/login.css">
 <link href="//netdna.bootstrapcdn.com/bootstrap/3.1.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<title>Login</title>
</head>
<body>
<div class="container">
    <div class="row">
        <div class="col-md-12">
            <div class="pr-wrap">
                <div class="pass-reset">
                    <label>
                        Enter the email you signed up with</label>
                    <input type="email" placeholder="Email" />
                    <input type="submit" value="Submit" class="pass-reset-submit btn btn-success btn-sm" />
                </div>
            </div>
            <div class="wrap">
                <p class="form-title">
                    Sign In</p>
                <form class="login" method="POST" id="form" action="${pageContext.request.contextPath}/login">
                <input name="username" id="username" type="text" placeholder="Username" />
                <input name="password" id="password" type="password" placeholder="Password" />
                <input type="submit" value="Sign In" id="submit" class="btn btn-success btn-sm" />
                <div class="remember-forgot">
                    <div class="row">
                        <div class="col-md-6">
                            <div class="checkbox">
                                <label>
                                    <input name="remember" id="remember" type="checkbox" />
                                    Remember Me
                                </label>
                            </div>
                        </div>
                        <div class="col-md-6 forgot-pass-content">
                            <a href="javascription:void(0)" class="forgot-pass">Forgot Password</a>
                        </div>
                    </div>
                </div>
                </form>
            </div>
        </div>
    </div>
</div>

 <script src="${pageContext.request.contextPath}/js/jquery-1.9.1.js"></script>
	
	<script type="text/javascript">
	$(document).ready(function () {
	    $('.forgot-pass').click(function(event) {
	      $(".pr-wrap").toggleClass("show-pass-reset");
	    }); 
	    
	    $('.pass-reset-submit').click(function(event) {	    	
	      $(".pr-wrap").removeClass("show-pass-reset");
	    }); 
	});
	  </script>
</body>
</html>