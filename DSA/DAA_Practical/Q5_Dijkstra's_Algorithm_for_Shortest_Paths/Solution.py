import heapq

def dijkstra(graph, start_vertex):
    # Number of vertices in the graph
    num_vertices = len(graph)
    
    # Distances from the start_vertex to each vertex
    distances = [float('inf')] * num_vertices
    distances[start_vertex] = 0
    
    # Priority queue to store (distance, vertex) tuples
    priority_queue = [(0, start_vertex)]
    
    while priority_queue:
        current_distance, current_vertex = heapq.heappop(priority_queue)
        
        # Skip processing if the distance is not up-to-date
        if current_distance > distances[current_vertex]:
            continue
        
        # Process each adjacent vertex
        for neighbor, weight in graph[current_vertex]:
            distance = current_distance + weight
            
            # Update the shortest distance to the neighbor
            if distance < distances[neighbor]:
                distances[neighbor] = distance
                heapq.heappush(priority_queue, (distance, neighbor))
    
    return distances

# Example usage:
# Graph representation: adjacency list with (neighbor, weight) tuples
graph = {
    0: [(1, 4), (2, 1)],
    1: [(3, 1)],
    2: [(1, 2), (3, 5)],
    3: []
}

start_vertex = 0
distances = dijkstra(graph, start_vertex)
print("Shortest distances from vertex", start_vertex, "to all other vertices:")
for vertex, distance in enumerate(distances):
    print(f"Vertex {vertex}: {distance}")