<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Processed Form Data</title>
</head>
<body>
	<?php

		$name = $_GET['name'];

		$mobile = $_GET['mobile'];

		echo "Welcome $name! I will call you at $mobile...";
	?>
</body>
</html>