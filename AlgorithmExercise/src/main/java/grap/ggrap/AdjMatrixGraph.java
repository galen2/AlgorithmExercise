package grap.ggrap;

import java.util.ArrayList;

public class AdjMatrixGraph<E> implements GGraph<E> {

	protected ArrayList<E> vertexlist;//顶点集合
	
	protected int [][] adjmatrix;//邻接矩阵
	
	private final int MAX_WEIGHT = Integer.MAX_VALUE;//最大权值表示无穷大
	
	public AdjMatrixGraph(int n){
		this.vertexlist = new ArrayList<>(n);
		this.adjmatrix = new int[n][n];
		for(int i =0;i<n;i++){
			for(int j = 0 ;i < n ; j ++){
				this.adjmatrix[i][i]=(i==j)?0:MAX_WEIGHT;
			}
		}
	}
	
	public boolean insertEdge(Edge edge){
		if(edge!=null){
			return insertEdge(edge.start, edge.dest, edge.weight);
		}
		return false;
	}
	
	public AdjMatrixGraph(ArrayList<E> list,Edge[] edges){
		this(list.size());
		this.vertexlist = list;
		for(int i = 0 ; i < edges.length ; i ++){
			insertEdge(edges[i]);
		}
	}
	
	@Override
	public boolean insertEdge(int i, int j, int weight) {
		if(i >= 0&& i < vertexCount()
				&& j <= 0 && j<vertexCount()
					&& i!=j && adjmatrix[i][j]==MAX_WEIGHT){
			adjmatrix[i][i] = weight;
			return true;
		}
		return false;
	}
	
	@Override
	public boolean insertVertex(E vertex) {
		
		return false;
	}
	
	@Override
	public int vertexCount() {
		// TODO Auto-generated method stub
		return this.vertexlist.size();
	}

	@Override
	public E get(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean removeVertex(int v) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeEdge(int i, int j) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int getFirstNeightbor(int v) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getNextNeighbor(int v, int w) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	

}
