# we can also use two different strings having the same value "ABCDE" in this case,
# but using a single one is more space saving and it works the same, in this case
string="ABCDE"
for i in string:
	for j in string:
		if j<=i:
			print(j,end="")
	print()