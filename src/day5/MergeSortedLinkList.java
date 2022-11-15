package day5;

public class MergeSortedLinkList {
	// Merging using extra space
	public static LinkedList mergeLists(LinkedList list1, LinkedList list2) {
		LinkedList result = new LinkedList();
		Node point1 = list1.head;
		Node point2 = list2.head;
		
		while(point1 != null && point2 != null) {
			
			if(point1.data < point2.data) {
				result.addAtRear(point1.data);
				point1 = point1.next;
			} else {
				result.addAtRear(point2.data);
				point2 = point2.next;
			}
		}
		while(point1 != null) {
			result.addAtRear(point1.data);
			point1 = point1.next;
		}
		while(point2 != null) {
			result.addAtRear(point2.data);
			point2 = point2.next;
		}
		
		return result;
	}

	public static void main(String[] args) {
		LinkedList listOne = new LinkedList();
		LinkedList listTwo = new LinkedList();
		
		listOne.addList(new int[] {12,14,17,40});
		listTwo.addList(new int[] {13,18,20,66});
//		mergeLists(listOne, listTwo).printLinkedList();
		System.out.println();
		listOne.sortedMerge(listTwo);
		listOne.printLinkedList();
	}

}
