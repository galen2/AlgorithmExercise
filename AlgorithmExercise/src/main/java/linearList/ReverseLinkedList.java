package linearList;

public class ReverseLinkedList<E> extends SinglyLinkedList<E>{
	
	public ReverseLinkedList(){
		super();
	}

	/**
	 * 单链表翻转
	 */
	public void reverse(){
		Node<E> p = this.head;
		Node<E> front = null;
		Node<E> after = null;
		while(p!=null){
			after = p.next;//线缓存起来，为了保证链表向下继续找
			p.next = front;
			front = p;
			p = after;
		}
		this.head = front;
	}

	
}
