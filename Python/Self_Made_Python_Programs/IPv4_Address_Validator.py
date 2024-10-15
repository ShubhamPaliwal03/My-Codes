# According to Wikipedia, IPv4 addresses are canonically represented in dot-decimal notation, which consists of four decimal numbers, each ranging from 0 to 255, separated by dots, e.g., 172.16.254.1 .
# A valid IPv4 Address is of the form x1.x2.x3.x4 where 0 <= (x1, x2, x3, x4) <= 255.
# Thus, we can write the generalized form of an IPv4 address as (0-255).(0-255).(0-255).(0-255).
# Note: Here we are considering numbers only from 0 to 255 and any additional leading zeroes will be considered invalid.

# Your task is to complete the function isValid which returns 1 if the given IPv4 address is valid else returns 0. The function takes the IPv4 address as the only argument in the form of string.

# Example 1:

# Input:
# IPv4 address = 222.111.111.111
# Output: 1
# Explanation: Here, the IPv4 address is as
# per the criteria mentioned and also all
# four decimal numbers lies in the mentioned
# range.

# Example 2:

# Input:
# IPv4 address = 5555..555
# Output: 0
# Explanation: 5555..555 is not a valid
# IPv4 address, as the middle two portions
# are missing.

def isValid(s):
    
    # A leading zero is any 0 digit that comes before the first nonzero digit in a number string in positional notation.
    
    numbers = s.split(".") # to split the string into a list by using '.' as a seperator
    
    if len(numbers)!=4: # if the IPv4 address doesn't contain four decimal numbers
        
        return 0
        
    else:
        
        for num in numbers:
            
            if num.isalpha(): # if a decimal number contains an alphabet
                
                return 0
            
            elif len(num)==0: # if the length of a decimal number is zero, ie., if there is no number
            
                return 0
            
            elif num[0]=='0' and len(num)!=1: # if a decimal number has leading zeroes or digits
                
                return 0
            
            elif int(num)<0 or int(num)>255: # if a decimal number in not in the range 0-255
                
                return 0
    
    return 1 # if it is a valid IPv4 address

test_address = input("Enter the address you want to test for being a valid IPv4 address : ")

print("\nValid IPv4 Address!") if isValid(test_address) else print("\nInvalid IPv4 address!")