<!DOCTYPE html>
<html>
<head>
	<title>;Student Dashboard</title>
</head>
<body>
	<h1><b>Dashboard</b></h1>
	<table>
		<tr>
			<th>Name:</th>
			<td>Kimz Mutale</td>
		</tr>
		<tr>
			<th>Year:</th>
			<td>3rd Year</td>
		</tr>
		<tr>
			<th>Program:</th>
			<td>Bachelor of Science in Computer Science</td>
		</tr>
		<tr>
			<th>Balance:</th>
			<td>K - 11,000.00</td>
		</tr>
	</table>
	<br>
	<form action="" method="post">
		<label for="payment-method">Payment Method:</label>
		<select id="payment-method" name="payment-method">
			<a href="paypal.html"><option value="paypal">Mobile Money</option></a>
			<option value="credit-card">Credit Card</option>
			<option value="bank-transfer">Bank Transfer</option>
		</select>
		<br/>
		<br/>
		
		<a href="mobilemoney.html"><input type="button" value="SELECT"></a>
	</form>
</body>
</html>

