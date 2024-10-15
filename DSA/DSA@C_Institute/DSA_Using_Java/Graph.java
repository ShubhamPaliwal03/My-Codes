import java.util.*;

class Graph
{
	static class Edge
	{
		private int source;
		private int neighbour;
		private int distance;

		Edge(int source, int neighbour, int distance)
		{
			this.source = source;
			this.neighbour = neighbour;
			this.distance = distance;
		}
	}

	public static void printPaths(int source, int destination, ArrayList<Edge>[] graph, boolean[] visited, StringBuilder path)
	{
		if(source == destination)
		{
			System.out.println("The Path from "+path.charAt(0)+" to "+destination+" is : "+path);

			return;
		}

		visited[source] = true;

		for(Edge edge : graph[source])
		{
			int pathLengthBefore = path.length(); // remember the length of the path before appending the neighbour

			if(!visited[edge.neighbour])
			{
				path.append(new StringBuilder(" -> "+String.valueOf(edge.neighbour)));

				printPaths(edge.neighbour, destination, graph, visited, path);
			}

			path.setLength(pathLengthBefore); // reset the length of the path to the one stored before starting the exploration of path (pathLengthBefore)
		}

		// reset the visited status of the current source node to allow other paths to be explored via this node

		visited[source] = false;
	}

	public static boolean hasPath(int source, int destination, ArrayList<Edge>[] graph, boolean[] visited)
	{
		if(source == destination)
		{
			return true;
		}

		visited[source] = true;

		for(Edge edge : graph[source])
		{
			if(!visited[edge.neighbour])
			{
				boolean hasNbrPath = hasPath(edge.neighbour, destination, graph, visited);

				if(hasNbrPath)
				{
					return true;
				}
			}
		}

		return false;
	}

	// using String class (no need of )

	// public static void printPaths(int source, int destination, ArrayList<Edge>[] graph, boolean[] visited, String path)
	// {
	// 	if(source == destination)
	// 	{
	// 		System.out.println("The Path from "+path.charAt(0)+" to "+destination+" is : "+path);

	// 		return;
	// 	}

	// 	visited[source] = true;

	// 	for(Edge edge : graph[source])
	// 	{
	// 		if(!visited[edge.neighbour])
	// 		{
	// 			printPaths(edge.neighbour, destination, graph, visited, path+edge.neighbour);
	// 		}
	// 	}

	// 	visited[source] = false;
	// }

	public static void addNodeToGraph(int i, ArrayList<Edge>[] graph)
	{
		Scanner kb = new Scanner(System.in);

		System.out.print("\nHow many neighbours does the Node have : ");

		int neighbours = kb.nextInt();

		for(int j = 1; j <= neighbours; j++)
		{
			System.out.print("\nEnter the value and distance (space-seperated) of neighbour "+j+" of Node "+i+" : ");

			int neighbour = kb.nextInt();
			int distance = kb.nextInt();

			graph[i].add(new Edge(i, neighbour, distance));
		}

		// System.out.println("Node added to graph successfully...");
	}

	public static ArrayList[] createGraph(int nodes)
	{
		Scanner kb = new Scanner(System.in);

		ArrayList<Edge>[] graph = new ArrayList[nodes];

		for(int i = 0; i < nodes; i++)
		{
			graph[i] = new ArrayList<Edge>();

			addNodeToGraph(i, graph);
		}

		return graph;
	}

	public static void main(String[] args)
	{
		// Scanner kb = new Scanner(System.in);

		// System.out.print("\nHow many nodes would you like to have in the graph : ");

		// int n = kb.nextInt();

		// ArrayList<Edge>[] graph = createGraph(n);

		/* Hard-coded adjacency list of a graph having 7 nodes (numbered from 0 to 6) */

		ArrayList<Edge>[] graph = new ArrayList[7];

		for(int i = 0; i < 7; i++)
		{
			graph[i] = new ArrayList<Edge>();
		}

		boolean[] visited = new boolean[7];

	    graph[0].add(new Edge(0,3,40));
	    graph[0].add(new Edge(0,1,10));

	    graph[1].add(new Edge(1,0,10));
	    graph[1].add(new Edge(1,2,10));

	    graph[2].add(new Edge(2,3,10));
	    graph[2].add(new Edge(2,1,10));
	    
	    graph[3].add(new Edge(3,0,40));
	    graph[3].add(new Edge(3,2,10));
	    graph[3].add(new Edge(3,4,2));

	    graph[4].add(new Edge(4,3,2));
	    graph[4].add(new Edge(4,5,3));
	    graph[4].add(new Edge(4,6,3));

	    graph[5].add(new Edge(5,4,3));
	    graph[5].add(new Edge(5,6,3));

	    graph[6].add(new Edge(6,5,3));
	    graph[6].add(new Edge(6,4,3));

		// System.out.print("\nEnter source and destination (space seperated), for which you want to check if a path exists in between them : ");

		// int source = kb.nextInt();
		// int destination = kb.nextInt();

		// boolean[] visited = new boolean[n];

		// if(hasPath(source, destination, graph, visited))
		// {
		// 	System.out.println("\nA Path exists between "+source+" and "+destination+" !");
		// }
		// else
		// {
		// 	System.out.println("\nNo Path exists between "+source+" and "+destination+" !");
		// }

		printPaths(0, 6, graph, visited, new StringBuilder("0"));

		// printPaths(0, 6, graph, visited, "0");
	}
}