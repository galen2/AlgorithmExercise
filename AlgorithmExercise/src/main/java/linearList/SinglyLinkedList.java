package linearList;

public class SinglyLinkedList<E> implements LList<E>{

	protected Node<E> head;
	
	public boolean isEmpty() {
		
		return this.head == null;
	}

	public int length() {
		int i = 0 ;
		Node<E> p = this.head;
		while(p!=null){
			i++;
			p = p.next;
		}
		return i;
	}

	public E get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * 操作成功返回原对象，否则返回NULL
	 */
	public E set(int index, E element) {
		if(this.head!=null && index >= 0 && element != null){
			int j = 0 ;
			Node<E> p = this.head;
			while(p!= null && j!=index){
				j++;
				p = p.next;
			}
			if(p!=null){
				E old = p.data;
				p.data = element;
				return old;
			}
		}
		return null;
	}


	/**
	 * index取值0,1,2·····
	 * 
	 * 在index位置的前一个元素加入此值
	 */
	public boolean add(int index, E element) {
		if(element == null)
			return false;
		//链表为空或者插入新的头结点
		if(head==null || index <= 0){
			Node<E> q = new Node<E>(element);
			q.next = this.head;
			this.head = q; 
		}
		else{
			int j = 0;
			Node<E> p = this.head;
			while(p.next !=null && j < index-1){//寻找插入位置
				j++;
				p = p.next;
			}
			Node<E> q = new Node<E>(element);
			q.next = p.next;
			p.next = q;
		}
		return true;
	}

	public boolean add(E element) {
		return add(Integer.MAX_VALUE,element);//因为add方法有p.next!=null的处理
	}

	public E remove(int index) {
		E old = null;
		if(this.head !=null && index >= 0){
			if(index == 0 ){
				old = this.head.data;
				this.head = this.head.next;
			}
			else{
				Node<E> p = this.head;
				int j = 0 ;
				while(p.next !=null && j < index-1){//定位到删除结点的前驱结点
					j++;
					p = p.next;
				}
				
				if(p.next !=null){//判断如果P是最后一个元素
					old = p.next.data;
					p.next = p.next.next;
				}
			}
		}
		return old;
	}

	public void clear() {
		this.head = null;
	}
	
	public String toString(){
		String str = "(";
		Node<E> p = this.head;
		while(p!=null){
			str+=p.data.toString();
			p = p.next;
			if(p!=null){
				str+=",";
			}
		}
		return str+=")";
	}
}
