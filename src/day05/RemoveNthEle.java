package day05;

public class RemoveNthEle {
	
	// Removing Nth element from last
	/*
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
*/

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addList(new int[] {12,14,17,40,55,76});
		list.removeLastNth(4);
		list.printLinkedList();
	}

}
