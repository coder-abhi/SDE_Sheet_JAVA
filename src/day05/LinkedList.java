package day05;


import java.util.HashSet;
import java.util.Set;

public class LinkedList {
	Node head;
	public LinkedList() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addAtFront(int element) {
		
		Node newNode = new Node(element);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	
	public void printLinkedList() {
		
		Node currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}
	public void addAtRear(int element) {
		if(head == null) {
			addAtFront(element);
			return;
		}
		Node currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new Node(element);
		
	}
	public int deleteAtFront() {
		if(head == null) {
			System.out.println("Linked List is already empty");
			return -1;
		}
		int data;
		if(head.next == null) {
			data = head.data;
			head =  null;
			return data;
		}
		
		data = head.data;
		head = head.next	;
		return data;
	}
	
	
	public void reverseLinkedList() {
		if(head == null || head.next == null) {
			return;
		}
		Node prev = null;
		Node curr = head;
		Node next = head.next ;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	public Node rev(Node head) {
		if(head == null || head.next == null) return head;
		Node newNode = rev(head.next);
		
		head.next.next = head;
		head.next = null;
		return newNode;
	}
	
	public void reverseLinkListRec() {
		head = rev(head);
	}

	public void addList(int[] arr) {
		for(int ele : arr) addAtRear(ele);
	}
	
	public void sortedMerge(LinkedList list) {
		Node listCurr = list.head;
		while(listCurr != null) {
			add(listCurr.data);
			listCurr = listCurr.next;
		}
	}
	public void add(int element) {
		Node newElement = new Node(element);
		
		// if list is empty - we will directly add element
		if(head == null) {
			head = newElement;
			return;
		}
		// if new element is less than first element then we add it at Front
		if(element < head.data ) {
			newElement.next = head;
			head = newElement;
			return;
		}
		
		Node prev = null;
		Node currentNode = head;
		//traversing till end of list && new Element is less than currend data
		while(currentNode != null && currentNode.data <= element) {
			prev = currentNode;
			currentNode = currentNode.next;
		}
		
		// adding element before current
		newElement.next = currentNode;
		prev.next = newElement;
	}
	
	// Removing Nth element from last
	public void removeLastNth(int index) {
		Node slow = head;
		Node fast = head;
		
		for(int i = 0; i<index ; i++) fast = fast.next;
		
		while(fast.next!=null) {
			slow = slow.next;
			fast = fast.next;
		}
		slow.next = slow.next.next;
	}
			
}
