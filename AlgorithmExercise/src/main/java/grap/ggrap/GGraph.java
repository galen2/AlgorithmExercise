package grap.ggrap;

public interface GGraph<E> {
	int vertexCount();//顶点元素个数
	E get(int i);
	boolean insertVertex(E vertex);//插入一个顶点
	boolean insertEdge(int i,int j,int weight);//插入一条权值为weight的边,注意：i和j分别为集合的下标
	boolean removeVertex(int v);//删除序号为V的顶点及其关联的边
	boolean removeEdge(int i, int j);//删除边
	int getFirstNeightbor(int v);//返回顶点v的第一个邻接顶点的序号
	int getNextNeighbor(int v,int w);//返回v在w后的下一个邻接顶点的序号
	
	
	
	

}
