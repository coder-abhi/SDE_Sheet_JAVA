package day5;

public class ReverseLinkedListTester {
/*
 * 	Code for Reverse
 * 
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
*/
	/*
	 * Reverse Recursively
	public Node rev(Node head) {
		if(head == null || head.next == null) return head;
		Node newNode = rev(head.next);
		
		head.next.next = head;
		head.next = null;
		return newNode;
	}
	*/
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addAtRear(10);
		list.addAtRear(20);
		list.addAtRear(40);
		list.addAtRear(77);
		
		list.printLinkedList();
		list.reverseLinkListRec();
		System.out.println();
		list.printLinkedList();
	}

}
