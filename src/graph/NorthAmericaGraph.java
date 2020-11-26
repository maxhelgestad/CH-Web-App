package graph;
//import ArrayList
import java.util.ArrayList;

/* 
 * The NorthAmericaMap class creates the data structure that will be used to represent 
 * the Map of North America.
 * 
 */
public class NorthAmericaGraph {
	//array of each country code - the countries will be represented by their
	//respective index in the code below
	public static final String[] COUNTRIES = {"CAN", "USA", "MEX", "BLZ", "GTM", 
				"SLV", "HND", "NIC", "CRI", "PAN"};
	//reference variable for the adjacency list that will represent the graph
	private static ArrayList<ArrayList<Integer>> adj;

	/*
	 * Constructs a NorthAmericaMap using an adjacency list. 
	 * Each entry in the list is another list that contains
	 * the adjacent vertices to that respective index 
	 */
	public NorthAmericaGraph(){
		// Adjacency list for storing which vertices are connected
		adj = new ArrayList<ArrayList<Integer>>(10);
		// add ArrayLists to Adjacency List
		for (int i = 0; i < 10; i++) { 
			adj.add(new ArrayList<Integer>()); 
		}
		//Create the graph (NorthAmericaMap) by adding
		//edges between countries that border each other
		adj.get(0).add(1); 
		adj.get(1).add(0); 
		adj.get(1).add(2); 
		adj.get(2).add(1); 
		adj.get(2).add(3); 
		adj.get(3).add(2); 
		adj.get(2).add(4); 
		adj.get(4).add(2); 
		adj.get(3).add(4); 
		adj.get(4).add(3); 
		adj.get(4).add(5); 
		adj.get(5).add(4); 
		adj.get(4).add(6); 
		adj.get(6).add(4); 
		adj.get(5).add(6); 
		adj.get(6).add(5); 
		adj.get(6).add(7); 
		adj.get(7).add(6); 
		adj.get(7).add(8); 
		adj.get(8).add(7); 
		adj.get(8).add(9); 
		adj.get(9).add(8);
	}

	/*
	 * This method returns the adjacency list that represents the graph
	 * 
	 * @return ArrayList<ArrayList<Integer>> - ArrayList of ArrayLists of Integers,
	 * 										   the adjacency list representing the
	 * 										   graph
	 */
	public ArrayList<ArrayList<Integer>> getList(){
		return adj;
	}
}
