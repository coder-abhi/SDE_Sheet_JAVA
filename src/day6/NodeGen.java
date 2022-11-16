package day6;

public class NodeGen<T> {
	T data;
	NodeGen next;
	public NodeGen(T data) {
		this.data = data;
		this.next = null;
	}
}
