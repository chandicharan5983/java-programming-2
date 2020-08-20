import java.io.*; 
import java.util.*; 
import java.util.LinkedList; 

class Graph1
{ 
	private int V; // No. of vertices 
	private LinkedList<Integer> adj[]; //Adjacency List 

	//Constructor 
	Graph1(int v) 
	{ 
		V = v; 
		adj = new LinkedList[v]; 
		for (int i=0; i<v; ++i) 
			adj[i] = new LinkedList(); 
	} 
	void addEdge(int v,int w) { adj[v].add(w); } 
	Boolean isReachable(int s, int d) 
	{ 
		LinkedList<Integer>temp; 

		// Mark all the vertices as not visited(By default set 
		// as false) 
		boolean visited[] = new boolean[V]; 

		// Create a queue for BFS 
		LinkedList<Integer> queue = new LinkedList<Integer>(); 

		// Mark the current node as visited and enqueue it 
		visited[s]=true; 
		queue.add(s); 
		Iterator<Integer> i; 
		while (queue.size()!=0) 
		{ 
			// Dequeue a vertex from queue and print it 
			s = queue.poll(); 

			int n; 
			i = adj[s].listIterator(); 

			while (i.hasNext()) 
			{ 
				n = i.next(); 
				if (n==d) 
					return true; 

				// Else, continue to do BFS 
				if (!visited[n]) 
				{ 
					visited[n] = true; 
					queue.add(n); 
				} 
			} 
		} 
		return false; 
	} 
	public static void main(String args[]) 
	{ 
		Graph1 g = new Graph1(4); 
		g.addEdge(0, 1); 
		g.addEdge(0, 2); 
		g.addEdge(1, 2); 
		g.addEdge(2, 0); 
		g.addEdge(2, 3); 
		g.addEdge(3, 3); 

		int u = 1; 
		int v = 3; 
		if (g.isReachable(u, v)) 
			System.out.println("There is a path from " + u +" to " + v); 
		else
			System.out.println("There is no path from " + u +" to " + v);; 

		u = 3; 
		v = 1; 
		if (g.isReachable(u, v)) 
			System.out.println("There is a path from " + u +" to " + v); 
		else
			System.out.println("There is no path from " + u +" to " + v);; 
	} 
}
