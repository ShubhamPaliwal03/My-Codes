from collections import deque, defaultdict

def bfs(graph, start_node):
    visited = set()
    queue = deque([start_node])
    visited.add(start_node)

    while queue:
        node = queue.popleft()
        print(node, end=' ')
        
        for neighbor in graph[node]:
            if neighbor not in visited:
                visited.add(neighbor)
                queue.append(neighbor)

# Example usage:
# Graph representation: adjacency list
graph = {
    0: [1, 2],
    1: [2, 3],
    2: [4],
    3: [4],
    4: []
}

start_node = 0
print("Nodes reachable from node", start_node, "using BFS:")
bfs(graph, start_node)