<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1" isELIgnored="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<!-- Window for inserting particular income routine-->
<div class="modal fade" id="income" tabindex="-1"
	role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog modal-sm">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">&times;</span><span class="sr-only">Close</span>
				</button>
				<h4 class="modal-title" id="myModalLabel">Modal title</h4>
			</div>
			<div class="modal-body">
				<label for="money">Income</label> <br> <input
					class="form-control" id="current_income" type="text" placeholder="&euro;">
			</div>
			<div class="modal-body">
				<select id="freq">
					<option value="1">OneTime
					<option value="2">Daily
					<option value="3">Weekly
					<option value="4">Monthly
					<option value="5">Quarterly
					<option value="6">Semiannually
					<option value="7">Annualy
				</select>
			</div>
			<div class="modal-footer">
				<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				<button type="button" class="btn btn-success"
					id="save_income">Save changes</button>
			</div>
		</div>
	</div>
</div>