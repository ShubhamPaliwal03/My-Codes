<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Function To Print Max Among Two Values</title>
</head>
<body>
	<?php

		function print_max($val1, $val2)
		{
			$max = 0;

			if($val1 > $val2)
			{
				$max = $val1;
			}
			else
			{
				$max = $val2;
			}

			echo"<p>Max among $val1 and $val2 is : $max</p>";
		}

		print_max(10, 8);
		print_max(-1, 8);

	?>
</body>
</html>