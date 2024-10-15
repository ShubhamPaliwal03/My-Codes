def dfs(graph, node, visited):
    visited.add(node)
    for neighbor in graph[node]:
        if neighbor not in visited:
            dfs(graph, neighbor, visited)

def is_connected(graph):
    visited = set()
    
    # Start DFS from the first node (assuming the graph is non-empty)
    start_node = next(iter(graph))
    dfs(graph, start_node, visited)
    
    # Check if all nodes were visited
    return len(visited) == len(graph)

# Example usage:
# Graph representation: adjacency list
graph = {
    0: [1, 2],
    1: [0, 2],
    2: [0, 1],
    3: [4],
    4: [3]
}

print("Graph is connected" if is_connected(graph) else "Graph is not connected")