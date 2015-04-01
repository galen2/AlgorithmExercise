package tree.binarytree;

import org.junit.Test;

public class BinaryTreeTest {

	@Test
	public void binaryTreeTest(){
		BinaryTree<String> tree = Traverse.create();
		tree.postOrder();
		tree.preOrder();
	}
}
