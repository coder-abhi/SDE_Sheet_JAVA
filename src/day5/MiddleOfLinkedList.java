package day5;

public class MiddleOfLinkedList {
	public static int MiddleEle(Node head) {
		Node fast = head;
		Node slow = head;
		
		// Tortoise Hare's algo
		// increament fast pointer by 2 step and slow by 1 step
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow.data;
	}
	
	// Tester
	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addList(new int[] {14,34,45,65,78});
		list.printLinkedList();
		System.out.println("\nMiddle ele : "+MiddleEle(list.head));
	}

}
