<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" isELIgnored="false"%>
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/home.css">
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/jquery-2.1.1.min.js"></script>
<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
	
<link rel="stylesheet" type="text/css"
	href="${pageContext.request.contextPath}/css/bootstrap.min.css" />
<script type="text/javascript" src="https://www.google.com/jsapi"></script>
<script type="text/javascript">
	
</script>
<body>
	<jsp:include page="cash_in_the_bank_modal.jsp"></jsp:include>
	<div class="fluid-container">
		<nav class="navbar navbar-default" style="margin-top: -20px;"
			role="navigation">
			<div class="navbar-header">
				<button type="button" class="navbar-toggle" data-toggle="collapse"
					data-target="#example-navbar-collapse">
					<span class="sr-only">Toggle navigation</span> <span
						class="icon-bar"></span> <span class="icon-bar"></span> <span
						class="icon-bar"></span>
				</button>
				<a class="navbar-brand" href="#">slika brate</a>
			</div>
			<div style="float: right;" class="collapse navbar-collapse"
				id="example-navbar-collapse">
				<ul class="nav navbar-nav">
					<li><a href="${pageContext.request.contextPath}/contact" style="margin-right:20px; font-weight:bold;">Contact us</a></li>
					<li><a href="#" style="margin-right:20px; font-weight:bold;">About</a></li>
					<li>
						<form action="${pageContext.request.contextPath}/home" method="post">
    						<input type="submit" class="btn btn-danger"
								style="margin-top: 8px; margin-right:20px; width: 100px;" value="Logout" />
						</form>
					</li>
				</ul>
			</div>
		</nav>

		<div class="list-group col-lg-3">
			<a href="#" class="list-group-item title">
				<h4 class="list-group-item-heading ">Plan your budget</h4>
			</a> <a data-toggle="modal" data-target="#cash_in_the_bank"
				class="list-group-item">
				<h4 class="list-group-item-heading">Cash in the bank</h4>
				<p class="list-group-item-text">Here you can enter your current
					bank account balance.</p>
			</a> <a href="#" class="list-group-item">
				<h4 class="list-group-item-heading">Current income</h4>
				<p class="list-group-item-text">Add your incomes (e.g.
					wage/salary, tax refund etc.)</p>
			</a> <a href="#" class="list-group-item">
				<h4 class="list-group-item-heading">Current spending</h4>
				<p class="list-group-item-text">Add your spendings (e.g. bank
					fees, bills, health insurance, vacation etc.)</p>
			</a>
		</div>
		<div id="chart_div" class="col-lg-9" style="height: 500px;"></div>
	</div>
	
	<script type="text/javascript"
	src="${pageContext.request.contextPath}/js/home.js"></script>
</body>