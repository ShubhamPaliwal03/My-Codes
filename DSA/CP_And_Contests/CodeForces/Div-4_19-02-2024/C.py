def sum_digits_2(n):
   r = 0
   while n:
       r, n = r + n % 10, n // 10
   return r

def sum_digits_3(n):
    return sum(map(int, str(n)))

def sum_digits_4(n):
    d = str(n)
    return sum(int(s) * d.count(s) for s in "123456789")   

t = int(input())

for _ in range(t):
    n = int(input())
    sum = 0

    for i in range(1, n + 1):
        if i < 10:
            sum += i
        elif i < 10000000000000000000:
            sum += sum_digits_2(i)
        elif i >= 10000000000000000000 and i < 100000000000000000000000000000:
            sum += sum_digits_3(i)
        else:
            sum += sum_digits_4(i)

    print(sum)