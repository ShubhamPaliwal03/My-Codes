arr = [1,5,3,2,5,1,2,3]

# we cannot use a set because a set does hold deep duplicate values 

visited = list()

freq = list()

for x in arr:

    if x not in visited:
        
        visited.append(x)
        
    freq.append(x)    
            
print(freq,visited)

if len(visited)==len(freq) :

    print("All the elements in the array have exact same frequency!")

else:
    
    print("All the elements in the array don't have exact same frequency!")
        