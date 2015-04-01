package tree.binarytree;

public class Traverse<E> {

	public static BinaryTree<String> create(){
		BinaryNode<String> child_d,child_b,child_c,child_a;
		child_d = new BinaryNode<String>("d", new BinaryNode<String>("h"), null);
		child_b = new BinaryNode<String>("b", child_d, new BinaryNode<String>("e"));
		child_c = new BinaryNode<String>("c", new BinaryNode<String>("f"), new BinaryNode<String>("g"));
		child_a = new BinaryNode<String>("a", child_b, child_c);
		return new BinaryTree<String>(child_a);
	}
	
	
	
}
