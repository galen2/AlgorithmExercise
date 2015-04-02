package tree.binarytree;

/**
 * 二叉树的操作 
 * @author Admin
 */
public class BinaryTreeOpera<E> extends BinaryTree<E>{
	
	/**
	 * 求节点的个数
	 * @return
	 */
	public int count(){
		return count(this.root);
	}
	
	private int count(BinaryNode<E> p){
		if(p!=null){
			return 1+count(p.left)+count(p.right);
		}
		else
			return 0;
	}
	
	public int height(){
		return height(this.root);
	}
	
	private int height(BinaryNode<E> p ){
		if(p!=null){
			int ld = 1+height(p.left);
			int rd = 1+height(p.right);
			return (ld>=rd)?ld:rd;
		}
		return 0;
	}
	
	public BinaryNode<E> search(E value){
		return search(this.root, value);
	}
	
	private BinaryNode<E> search(BinaryNode<E> p,E value){
		BinaryNode<E> find = null;
		if(p!=null){
			if(p.data == value){ 
				find = p;
			}else{
				find = search(p.left, value);
				if(find == null){
					find = search(p.right, value);
				}
			}
		}
		return find;
	}
	
	
	
}
