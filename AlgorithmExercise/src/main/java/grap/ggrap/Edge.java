package grap.ggrap;

public class Edge implements Comparable<Edge>{

	public int start;
	public int dest;
	public int weight;
	
	public Edge(int start,int dest,int weight){
		this.start = start;
		this.dest = dest;
		this.weight = weight;
	}
	
	public String toString(){
		return "("+start+","+dest+","+weight+")";
	}
	
	
	@Override
	public int compareTo(Edge o) {
		return 0;
	}
	
	
	

}
