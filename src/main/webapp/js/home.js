google.load("visualization", "1", {
	packages : [ "corechart" ]
});
var data;
var rows;
var cash;
var income;
var total;
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
				var j = date.getMonth() + 1;
				var year = 2013;
				
				for(var i=0;i<12;i++)
				{
					
					data.addRows([
								    [months[j++].toString() + ' ' + year.toString(),cash+=income],
								]);
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
			var j = date.getMonth() + 1;
			var year = 2013;
			
			for(var i=0;i<12;i++)
			{
				
				data.addRows([
							    [months[j++].toString() + ' ' + year.toString(),cash-=spending],
							]);
				if(j==11)
				{
					j=0;
					year++;
				}
					
			}
			
			drawChart();
		});