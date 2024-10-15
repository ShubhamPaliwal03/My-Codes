#User function Template for python3

def isVowel(alpha):
    
    # if alpha == 'a' or alpha == 'e' or alpha == 'i' or alpha == 'o' or alpha == 'u':
        
    #     return True
        
    # else:
        
    #     return False
    
    vowels = ['a','e','i','o','u']
    
    if alpha in vowels :
        
        return True
        
    else:
        
        return False
            
class Solution:
            
    
    def modify(self, s):
        # code here
        slist = list()
        
        for x in s:
            
            slist.append(x)
        
        i = 0
        j = len(slist)-1
        
        while(i<j):
            
            if (not(isVowel(slist[i]))) and (not (isVowel(slist[j]))):
                
                i+=1
                j-=1
                
            elif (isVowel(slist[i])) and (not (isVowel(slist[j]))):
                
                j-=1
                
            elif (not (isVowel(slist[i]))) and (isVowel(slist[j])):
                
                i+=1
                
            else: # when both are vowels
            
                # swapping using third variable
                
                # temp     = slist[i]
                # slist[i] = slist[j]
                # slist[j] = temp
                
                slist[i],slist[j] = slist[j],slist[i] # swapping using tuple packing
                
                i+=1
                j-=1
                
        # str = ''.join(slist)
        
        # return str
        
        return ''.join(slist)

#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__':
    t = int(input("Enter the number of test cases you want to validate : "))
    print("\nEnter the string : ",end="")
    for _ in range(t):
        s = input().strip()
        ob = Solution()
        ans = ob.modify(s)
        print(ans)
# } Driver Code Ends