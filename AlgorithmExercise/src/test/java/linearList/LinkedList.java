package linearList;

import org.junit.Test;

public class LinkedList {

	@Test
	public void linkedListDemo(){
		java.util.LinkedList<String> list = new java.util.LinkedList<String>();
		list.add("a");
		list.add("b");
		System.out.println(list.remove(4));
	}
	
	@Test
	public void SinglyLinkedListDemo(){
		SinglyLinkedList<String> list = new SinglyLinkedList<String>();
		list.add("a");
		list.add("a");
		list.add("a");
		System.out.println(list);
		System.out.println(list.remove(8));
	}
}
