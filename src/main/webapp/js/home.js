google.load("visualization", "1", {
	packages : [ "corechart" ]
});
var data;
var rows;
var cash;
var income;
var total;
var incomes = new Array();
var spendings = new Array();
google.setOnLoadCallback(function() {
	rows = [ [ 'Year', 'Sales' ], [ 0, 0 ] ];
	data = google.visualization.arrayToDataTable();
	drawChart();
});

function drawChart() {
	var options = {
		title : 'Company Performance'
	};

	var chart = new google.visualization.LineChart(document
			.getElementById('chart_div'));
	chart.draw(data, options);
}

$('#save_cash_in_the_bank').click(
		function() {
			
			
			 var date = new Date();

			data = new google.visualization.DataTable();
			data.addColumn('string', 'Month'); 
			data.addColumn('number', 'Cash'); 
			
			var months = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
			cash = parseFloat($('#current_balance').val());
			var j = date.getMonth() + 1;
			var year = 2013;
			
			for(var i=0;i<13;i++)
			{
				
				data.addRows([
							    [months[j++].toString() + ' ' + year.toString(),cash],
							]);
				if(j==12)
				{
					j=0;
					year++;
				}
					
			}
			
			drawChart();
			
		});

$('#save_income').click(
		function() {
			
			 var date = new Date();

			 data = new google.visualization.DataTable();
				data.addColumn('string', 'Month'); 
				data.addColumn('number', 'Cash'); 
				
				var months = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
				income = parseFloat($('#current_income').val());
				var freq=$('#freq').val();
				incomes.push(income);
				var j = date.getMonth() + 1;
				var year = 2014;
				//var totalCash = 0;
				
				totalCash = cash + income;
				
				for(var i=0;i<12;i++)
				{	
					
						if(freq == 1)
						{
							
							data.addRows([
										    [months[j++].toString() + ' ' + year.toString(),totalCash],
										]);
							cash=totalCash;
						}
						else if(freq == 2)
						{
							data.addRows([
										    [months[j++].toString() + ' ' + year.toString(),cash+=(income * 30)],
										]);
						}
						else if(freq == 3)
						{
							data.addRows([
										    [months[j++].toString() + ' ' + year.toString(),cash+=(income * 4)],
										]);		
						}
						else if(freq == 4)
						{
							data.addRows([
										    [months[j++].toString() + ' ' + year.toString(),cash+=income],
										]);		
						}
						else if(freq == 5)
						{
							if(i % 4 == 0)
							{
								cash+=income;
							}
							data.addRows([
										    [months[j++].toString() + ' ' + year.toString(),cash],
										]);	
							
						}
						else if(freq == 6)
						{
							if(i % 6 == 0)
							{
								cash+=income;
							}
							data.addRows([
										    [months[j++].toString() + ' ' + year.toString(),cash],
										]);	
							
						}
						else if(freq == 7)
						{
							if(i % 11 == 0)
							{
								cash+=income;
							}
							data.addRows([
										    [months[j++].toString() + ' ' + year.toString(),cash],
										]);	
							
						}
					
					
					if(j==11)
					{
						j=0;
						year++;
					}
						
				}
				
				drawChart();
				
			
			
		});

$('#save_spending').click(
		function() {
			
			var date = new Date();

			data = new google.visualization.DataTable();
			data.addColumn('string', 'Month'); 
			data.addColumn('number', 'Cash'); 
			
			var months = ['Jan', 'Feb', 'Mar', 'Apr', 'May', 'Jun', 'Jul', 'Aug', 'Sep', 'Oct', 'Nov', 'Dec'];
			var spending = parseFloat($('#current_spending').val());
			var freq=$('#freq').val();
			spendings.push(spending);
			var j = date.getMonth() + 1;
			var year = 2014;
			totalCash = cash - spending;
			
			for(var i=0;i<12;i++)
			{	
					if(freq == 1)
					{
						
						data.addRows([
									    [months[j++].toString() + ' ' + year.toString(),totalCash],
									]);
						cash = totalCash;
					}
					else if(freq == 2)
					{
						data.addRows([
									    [months[j++].toString() + ' ' + year.toString(),cash-=(spending * 30)],
									]);
					}
					else if(freq == 3)
					{
						data.addRows([
									    [months[j++].toString() + ' ' + year.toString(),cash-=(spending * 4)],
									]);		
					}
					else if(freq == 4)
					{
						data.addRows([
									    [months[j++].toString() + ' ' + year.toString(),cash-=spending],
									]);		
					}
					else if(freq == 5)
					{
						if(i % 4 == 0)
						{
							cash-=spending;
						}
						data.addRows([
									    [months[j++].toString() + ' ' + year.toString(),cash],
									]);	
						
					}
					else if(freq == 6)
					{
						if(i % 6 == 0)
						{
							cash-=spending;
						}
						data.addRows([
									    [months[j++].toString() + ' ' + year.toString(),cash],
									]);	
						
					}
					else if(freq == 7)
					{
						if(i % 11 == 0)
						{
							cash-=spending;
						}
						data.addRows([
									    [months[j++].toString() + ' ' + year.toString(),cash],
									]);	
						
					}
				
				
				if(j==11)
				{
					j=0;
					year++;
				}
					
			}
			
			drawChart();
		
			
		});