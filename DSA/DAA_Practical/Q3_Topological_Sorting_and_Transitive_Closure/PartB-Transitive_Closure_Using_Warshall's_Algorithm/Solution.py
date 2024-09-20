# Function to compute transitive closure using Warshall's algorithm
def warshall_algorithm(graph):
    V = len(graph)
    transitive_closure = [[graph[i][j] for j in range(V)] for i in range(V)]

    for k in range(V):
        for i in range(V):
            for j in range(V):
                transitive_closure[i][j] = transitive_closure[i][j] or (transitive_closure[i][k] and transitive_closure[k][j])

    return transitive_closure

# Example usage:
graph = [
    [1, 1, 0, 0],
    [0, 1, 1, 0],
    [0, 0, 1, 1],
    [0, 0, 0, 1]
]

transitive_closure = warshall_algorithm(graph)
print("Transitive closure of the given graph is:")
for row in transitive_closure:
    print(row)