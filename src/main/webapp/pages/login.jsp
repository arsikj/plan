<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
	<head>
		   <!-- <script type="text/javascript" src="https://www.google.com/jsapi"></script>
			    <script type="text/javascript">
				      google.load("visualization", "1", {packages:["corechart"]});
				      google.setOnLoadCallback(drawChart);
				      function drawChart() {
				        var data = google.visualization.arrayToDataTable([
				          ['Year', 'Sales', 'Expenses','All'],
				          ['2004',  100,      400,500],
				          ['2005',  1170,      460,2000],
				          ['2006',  660,       1120,1500],
				          ['2007',  1030,      540,2500]
				        ]);
				
				        var options = {
				          title: 'Company Performance'
				        };
				    
				        var chart = new google.visualization.LineChart(document.getElementById('chart_div'));
				        chart.draw(data, options);
				      }
	    		</script>  -->
	</head>
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