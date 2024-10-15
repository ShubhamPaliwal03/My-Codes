# You are given an integer n. You have to check if there exists two positive integers A and B
# such that A+B = N and A&B > 0 (Where & is the bitwise and operator.)

def check(n):
    for x in range(0, n+1):
        for y in range(0, n+1):
            if (x + y == n) and (x & y > 0):
                return True
                # print(x," ",y)
    return False
print(check(int(input())))