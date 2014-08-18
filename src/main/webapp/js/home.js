google.load("visualization", "1", {
	packages : [ "corechart" ]
});
var data;
var rows;
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
			var tmp = [ (new Date).getSeconds(),
					parseFloat($('#current_balance').val()) ];
			rows[rows.length] = tmp;
			data = google.visualization.arrayToDataTable(rows);
			drawChart();
		});