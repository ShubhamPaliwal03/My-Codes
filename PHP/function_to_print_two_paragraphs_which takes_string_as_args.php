<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Function To Print Two Paragraphs</title>
</head>
<body>
	<?php

		function print_para($p1, $p2)
		{
			echo "<p>$p1</p>";

			echo "<p>$p2</p>";
		}

		print_para("Hi everyone! My name is Shubham Paliwal", "I am currently learning PHP!");

	?>
</body>
</html>