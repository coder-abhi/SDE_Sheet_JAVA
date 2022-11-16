package day06;

import java.util.HashSet;
import java.util.Set;


public class DetectACycle {
	
	public static int detectACyclePointer(LinkedList list) {
		Node slow = list.head;
		Node fast = list.head;
		
		do {
			// if we found end of list then there is no cycle detected
			if(fast == null || fast.next == null) return -1;
			
			// moving pointer with different speed
			slow = slow.next;
			fast = fast.next.next;
			
		}while(slow != fast);
		
		// slow reset to head
		slow = list.head;
		
		// again traversing but both with 1 step at a time
		while(slow != fast) {
			slow = slow.next;
			fast = fast.next;
		}
		
		// point of intersection is answer
		return slow.data;
	}

	// cycle detection in brute force
	public static int detectACycleBruteForce(LinkedList list){
		Set<Node> set = new HashSet<Node>();
		Node currentNode = list.head;
		while(currentNode != null) {
			// if set is unable to take value, means its duplicate - return it;
			if(!set.add(currentNode)) {
				return currentNode.data;
			}
			currentNode = currentNode.next;
		}
		// if no value is unable to put in set means all are unique - no cycle found!
		return -1;
	}
	
	// creating cycle in list for testing
	public static void createCycle(LinkedList list, int index) {
		Node cyclePoint = null;
		Node currentNode = list.head;
		
		while(currentNode.next != null) {
			if(index != 0) {
				cyclePoint = currentNode;
				index--;
			}
			currentNode = currentNode.next;
		}
		currentNode.next = cyclePoint;
		
	}
	
	
	public static void main(String[] args) {
		LinkedList list = new LinkedList();	
		list.addList(new int[] {12,14,17,40,55,76});
		createCycle(list, 4);
		
		System.out.println( detectACycleBruteForce(list) );
		System.out.println( detectACyclePointer(list) );
//		list.printLinkedList();
	}

}
