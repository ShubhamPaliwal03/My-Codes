# Q3. WAP to print following pattern using the nested for loops.
# 
#         1
#        121
#       12321
#      1234321
#     123454321

for i in range(1, 6) :

        for j in range(5, i, -1): # to print spaces

                print(end = " ")

        for j in range(1, i+1) : # to print numbers of 1st half

                print(j, end = "")

        for j in range(i-1, 0, -1): # to print numbers of 2nd half

                print(j, end="")

        print()