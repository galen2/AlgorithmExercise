package linearList;

import org.junit.Test;

import util.BaseTest;

public class LinkedList extends BaseTest{

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
		list.add("b");
		list.add("c");
	}
	@Test
	public void ReverseLinkedListDemo(){
		ReverseLinkedList<String> list  = new ReverseLinkedList<String>();
		list.add("a");
		list.add("b");
		list.add("c");
		list.reverse();
		printData (list);
	}
}
