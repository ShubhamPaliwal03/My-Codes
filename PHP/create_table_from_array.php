<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Create Table From Array</title>
	<style type="text/css">
		table, th, td
		{
			border: solid 1px black;

			border-collapse: collapse;
		}
		th, td
		{
			padding: 10px;
		}
	</style>
<body>
	<?php

		$bill = Array("Chowmein"=>45, "Momos"=>65, "Golgappa"=>20);

		echo"<table>";

			echo"<th>Key</th>";

			echo"<th>Value</th>";

			foreach($bill as $key=>$value)
			{
				echo"<tr>";

					echo"<td>".$key."</td>";

					echo"<td>".$value."</td>";

				echo"</tr>";
			}

		echo"</table>";

	?>
</body>
</html>