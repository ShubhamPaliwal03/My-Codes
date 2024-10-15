def rev(n):

	num=n
	r=0

	while num!=0:

		m = num % 10
		r = r * 10 + m
		num = num // 10

	return r