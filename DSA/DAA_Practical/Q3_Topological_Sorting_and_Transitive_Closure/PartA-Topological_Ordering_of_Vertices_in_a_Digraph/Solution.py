from collections import defaultdict

# Class to represent a graph
class Graph:
    def __init__(self, vertices):
        self.graph = defaultdict(list)  # dictionary containing adjacency List
        self.V = vertices  # number of vertices

    # function to add an edge to the graph
    def add_edge(self, u, v):
        self.graph[u].append(v)

    # recursive function to perform DFS
    def topological_sort_util(self, v, visited, stack):
        visited[v] = True

        # Recur for all the vertices adjacent to this vertex
        for i in self.graph[v]:
            if not visited[i]:
                self.topological_sort_util(i, visited, stack)

        stack.insert(0, v)

    # Function to perform topological sort
    def topological_sort(self):
        visited = [False] * self.V
        stack = []

        # Call the recursive helper function for all vertices
        for i in range(self.V):
            if not visited[i]:
                self.topological_sort_util(i, visited, stack)

        return stack

# Example usage:
g = Graph(6)
g.add_edge(5, 2)
g.add_edge(5, 0)
g.add_edge(4, 0)
g.add_edge(4, 1)
g.add_edge(2, 3)
g.add_edge(3, 1)

print("Topological Sort of the given graph is:")
print(g.topological_sort())