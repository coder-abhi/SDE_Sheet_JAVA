package day06;


import java.util.HashSet;
import java.util.Set;

public class LinkedListGen<T> {
	public NodeGen<T> head;
	public LinkedListGen() {
		head = null;
	}
	
	public boolean isEmpty() {
		return head==null;
	}
	
	public void addAtFront(T element) {
		
		NodeGen<T> newNode = new NodeGen<T>(element);
		if(head == null) {
			head = newNode;
			return;
		}
		newNode.next = head;
		head = newNode;
	}

	
	@SuppressWarnings("unchecked")
	public void printLinkedList() {
		
		NodeGen<T> currentNode = head;
		while(currentNode != null) {
			System.out.print(currentNode.data + " ");
			currentNode = currentNode.next;
		}
	}
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public void addAtRear(T element) {
		if(head == null) {
			addAtFront(element);
			return;
		}
		NodeGen currentNode = head;
		while(currentNode.next != null) {
			currentNode = currentNode.next;
		}
		currentNode.next = new NodeGen(element);
		
	}
	public T deleteAtFront() {
		if(head == null) {
			System.out.println("Linked List is already empty");
			return null;
		}
		T data;
		if(head.next == null) {
			data = head.data;
			head =  null;
			return data;
		}
		
		data = head.data;
		head = head.next	;
		return data;
	}
	
	
	@SuppressWarnings("rawtypes")
	public void reverseLinkedList() {
		if(head == null || head.next == null) {
			return;
		}
		NodeGen prev = null;
		NodeGen curr = head;
		NodeGen next = head.next ;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		head = prev;
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public NodeGen rev(NodeGen head) {
		if(head == null || head.next == null) return head;
		NodeGen newNode = rev(head.next);
		
		head.next.next = head;
		head.next = null;
		return newNode;
	}
	
	@SuppressWarnings("unchecked")
	public void reverseLinkListRec() {
		head = rev(head);
	}

	public void addList(T[] arr) {
		for(T ele : arr) addAtRear(ele);
	}
	

			
}
