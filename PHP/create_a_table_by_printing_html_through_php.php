<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Document</title>
	<style type="text/css">
		td
		{
			height: 5em;
			width: 10em;
			font-weight: 600;
		}
		th
		{
			height: 3em;
			background-color: cornflowerblue;
		}
		td, th
		{
			text-align: center;
			font-size: 1em; 
		}
		table
		{
			margin: 0px auto;
			background-color: lightblue;
			padding: 2em;
			position: relative;
			top: 15dvh;
		}
		table, th, td
		{
			border: solid 2px black;
			border-collapse: collapse;
		}
	</style>
</head>
<body>	
	<?php
		echo '<table>
				<tr>
					<th>S.No.</th>
					<th>Name</th>
					<th>Roll Number</th>
				</tr>
				<tr>
					<td>1</td>
					<td>Shubham Paliwal</td>
					<td>1001</td>
				</tr>
				<tr>
					<td>2</td>
					<td>Narendra Sharma</td>
					<td>1002</td>
				</tr>
				<tr>
					<td>3</td>
					<td>Ranu Soni</td>
					<td>1003</td>
				</tr>
				<tr>
					<td>4</td>
					<td>Vishwajeet</td>
					<td>1004</td>
				</tr>
				<tr>
					<td>5</td>
					<td>Ujjwal</td>
					<td>1005</td>
				</tr>
			</table>';
	?>
</body>
</html>
