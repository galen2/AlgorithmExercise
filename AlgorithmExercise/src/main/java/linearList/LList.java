package linearList;

public interface LList<E> {
	
	boolean isEmpty();
	int length();
	E get(int index);
	E set(int index,E element);
	boolean add(int index,E element);
	boolean add(E element);
	E remove(int index);
	void clear();
	

}
