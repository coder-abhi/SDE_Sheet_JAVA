package day14;

public class LRUCache  {
	public class Node {
		int key;
		int value;
		Node next;
		public Node(int key,int value) {
			this.key = key;
			this.value = value;
			this.next = null;
		}
	}
	
	Node head;
	Node tail;
	int size;
	
	public LRUCache(int size) {
		head = null;
		tail = null;
		this.size = size;
	}
	
	public void addAtFront(int key, int value) {
		
		Node newNode = new Node(key,value);
		if(head == null) {
			head = tail = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	
	
	public void printLinkedList() {
		
		Node currentNode = head;
		// traversing list till end of list
		while(currentNode != null) {
			System.out.print(currentNode.key + ":"+ currentNode.value+" ");
			currentNode = currentNode.next;
		}
	}

	
	
	public int count() {
		int count = 0;
		Node currentNode = head;
		while(currentNode != null) {
			count++;
			currentNode = currentNode.next;
		}
		return count;
	}
	
	
	
	public void deleteAtRearUsingTail() {
		if(head == null) {
			return ;
		}
		
		// if list have only one element
		if(head.next == null) {
			head = tail = null;
			return ;
		}
		Node prev = null;
		Node curr = head;
		while(curr.next != null) {
			prev = curr;
			curr = curr.next;
		}
		
		// adding at end
		prev.next = null;
		return ;
	}
	
	
	public void put(int key,int value) {
		if(count() >= this.size) {
			deleteAtRearUsingTail();
		}
		addAtFront(key,value);
		return;
	}
	
	public int get(int key) {
		
		if(head.key == key) return head.value;
		
		// finding key
		Node prev = null;
		Node curr = head;
		
		while(curr != null) {
			if(curr.key == key) {
				addAtFront(curr.key, curr.value);
				prev.next = curr.next;
				return curr.value;
			}
			prev = curr;
			curr = curr.next;
		}
		return -1;
	}
	
	
	public static void main(String[] args) {
		LRUCache cache = new LRUCache(3);
		cache.put(1, 45);
		cache.put(2, 67);
		cache.put(3, 67);
		cache.get(1);
		cache.put(4, 88);
		cache.printLinkedList();	}
}
