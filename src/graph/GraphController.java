package graph;
//import java util
import java.util.*;

/*
 * The GraphController class is used in conjunction with NorthAmericaMap. It hold methods to 
 * find the shortest path from a source to a destination and keep track of that path.
 */
public class GraphController {
	/*
	 * This method will print the shortest path between the source
	 * vertex (USA) and destination vertex (end country)
	 * 
	 * @param adj - Adjacency List representing graph
	 * @param s - source vertex
	 * @param dest - destination vertex
	 * @param v - total number of vertices
	 * 
	 * @return LinkedList<Integer> - Linked list of the vertices of the shortest path
	 * 								 between the source and destination
	 */
	public static LinkedList<Integer> printShortestPath( 
			ArrayList<ArrayList<Integer>> adj, 
			int src, int dest, int v) { 
		// previous[i] array stores previous visited vertex  
		int previous[] = new int[v];  

		if (BFS(adj, src, dest, v, previous) == false) { 
			System.out.println("This Destination can't be reached from USA"); 
			//return; 
		} 

		// LinkedList to store path 
		LinkedList<Integer> path = new LinkedList<Integer>(); 
		int next = dest; 
		path.add(next); 
		while (previous[next] != -1) { 
			path.add(previous[next]); 
			next = previous[next]; 
		}  
			
		return path;
	} 

	/*
	 * This method is a version of Breadth-First-Search
	 * that stores the previously visited vertex in previous[]
	 * 
	 * @param adj - Adjacency list representing graph
	 * @param source - source vertex
	 * @param dest - destination vertex
	 * @param v - number of vertices
	 * @param previous[] - array to store previously visited vertices
	 * @return boolean - true if a path between source and destination exists
	 */
	private static boolean BFS(ArrayList<ArrayList<Integer>> adj, int src, 
			int dest, int v, int previous[]) {			
		// a linked list to act as a queue that stores
		LinkedList<Integer> queue = new LinkedList<Integer>(); 			
		//visited array - true if vertex has been visited
		boolean visited[] = new boolean[v]; 
		//no vertices are visited yet and on previous vertices
		for (int i = 0; i < v; i++) { 
			visited[i] = false;  
			previous[i] = -1; 
		} 
		//source is first visited and added to queue 
		visited[src] = true; 
		queue.add(src); 
		// bfs Algorithm 
		while (!queue.isEmpty()) { 
			int c = queue.remove(); 
			for (int i = 0; i < adj.get(c).size(); i++) { 
				if (visited[adj.get(c).get(i)] == false) { 
					visited[adj.get(c).get(i)] = true;  
					previous[adj.get(c).get(i)] = c; 
					queue.add(adj.get(c).get(i)); 
					//stops when destination is found
					if (adj.get(c).get(i) == dest){
						return true; 
					}
				} 
			} 
		} 
		return false; 
	} 
}

