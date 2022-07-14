package amzn.graph;

import java.util.ArrayList;

public class FindRouteGraph {

	public FindRouteGraph(int i, int j) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		
		  int[][] graphD = new int[][]{

		        {-1, 1,-1,-1,-1},
		        {-1,-1, 1,-1,-1},
		        {-1,-1, 1, 1,-1},
		        {-1,-1,-1,-1,-1},
		        { 1,-1, 1,-1,-1}
		    };

		    ArrayList<FindRouteGraph> nodes = new ArrayList<FindRouteGraph>();
		    nodes.add(new FindRouteGraph(0,0));//node A
		    nodes.add(new FindRouteGraph(1,1)); // node B
		    nodes.add(new FindRouteGraph(2,2)); // node C
		    nodes.add(new FindRouteGraph(3,3)); // node D
		    nodes.add(new FindRouteGraph(4,4)); // node E

		    /**
		     *  A->b
		     * B->C
		     * C->C
		     * C->D
		     * E-A
		     * 
		     */ 

		    System.out.println(" is A -B connected?"+isThereARoute(graphD, nodes.get(0), nodes.get(1)));
		    System.out.println(" is A -D connected?"+isThereARoute(graphD, nodes.get(0), nodes.get(3)));
		    System.out.println(" is C -A connected?"+isThereARoute(graphD, nodes.get(3), nodes.get(0)));
		    System.out.println(" is A -E connected?"+isThereARoute(graphD, nodes.get(0), nodes.get(4)));
		    System.out.println(" is C -C connected?"+isThereARoute(graphD, nodes.get(2), nodes.get(2)));
	}

	private static String isThereARoute(int[][] graphD, FindRouteGraph findRouteGraph, FindRouteGraph findRouteGraph2) {
		
		return null;
	}

}
