package tree.binarytree;

public class BinaryTree<E> {
	
	public BinaryNode<E> root;

	public BinaryTree(){
		this.root = null; 
	}
	
	public BinaryTree(BinaryNode<E> root){
		this.root  = root;
	}
	
	public boolean isEmpty(){
		return this.root == null;
	}

	public BinaryNode<E> getRoot(){
		return this.root;
	}
	
	/**
	 * 先根遍历
	 */
	public void preOrder(){
		System.out.println("先根遍历");
		preOrder(root);
	}
	
	private void preOrder(BinaryNode<E> p){
		if(p!=null){
			System.out.print(p);
			preOrder(p.left);
			preOrder(p.right);
		}
	}
	
	public void inOrder(){
		System.out.println("中根遍历");
		inOrder(root);
	}
	
	private void inOrder(BinaryNode<E> p){
		if(p!=null){
			inOrder(p.left);
			System.out.print(p);
			inOrder(p.right);
		}
	}
	
	public void postOrder(){
		System.out.println("后根遍历:");
		postOrder(root);
	}
	
	private void postOrder(BinaryNode<E> p){
		if(p!=null){
			postOrder(p.left);
			postOrder(p.right);
			System.out.print(p);
		}
	}
}
