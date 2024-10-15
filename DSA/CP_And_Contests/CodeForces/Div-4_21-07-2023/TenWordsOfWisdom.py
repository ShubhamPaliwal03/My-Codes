t = int(input())

count = 0

while count!=t:

	n = int(input())

	maximum = 1

	cnt = 0
	
	i=0
	res=0
	
	while(cnt!=n):
	
		i+=1
		
		a,b = map(int, input().split())

		if a<=10:
		
			if b>maximum:
			
				maximum = b
				
				res = i
		
		cnt+=1
	
	print(res)