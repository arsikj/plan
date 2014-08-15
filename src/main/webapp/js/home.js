google.load("visualization", "1", {
	packages : [ "corechart" ]
});
var data;
google.setOnLoadCallback(function() {
	data = google.visualization.arrayToDataTable([ [ 'Year', 'Sales' ],
			[ 0, 0 ] ]);
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
			data[data.length] = [ (new Date).getFullYear(),
					parseFloat($('#current_balance').val()) ];
			drawChart();
		});