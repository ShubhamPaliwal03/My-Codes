import heapq

def prim(graph, start_vertex):
    n = len(graph)  # Number of vertices
    mst_cost = 0
    mst_edges = []
    visited = [False] * n
    min_heap = []

    # Initialize the priority queue with edges from the start vertex
    def add_edges(vertex):
        visited[vertex] = True
        for neighbor, weight in graph[vertex]:
            if not visited[neighbor]:
                heapq.heappush(min_heap, (weight, neighbor, vertex))

    # Start with the given start_vertex
    add_edges(start_vertex)

    while min_heap:
        weight, u, v = heapq.heappop(min_heap)
        if visited[v]:
            continue
        
        # Include this edge in the MST
        visited[v] = True
        mst_cost += weight
        mst_edges.append((u, v, weight))
        
        # Add edges from the newly added vertex
        add_edges(v)
    
    return mst_edges, mst_cost

# Example usage:
# Graph representation: adjacency list with (neighbor, weight) tuples
graph = {
    0: [(1, 4), (2, 1)],
    1: [(0, 4), (2, 2), (3, 5)],
    2: [(0, 1), (1, 2), (3, 8)],
    3: [(1, 5), (2, 8)]
}

start_vertex = 0
mst_edges, mst_cost = prim(graph, start_vertex)
print("Edges in the Minimum Spanning Tree:")
for u, v, weight in mst_edges:
    print(f"{u} -- {v} == {weight}")

print("Total cost of Minimum Spanning Tree:", mst_cost)