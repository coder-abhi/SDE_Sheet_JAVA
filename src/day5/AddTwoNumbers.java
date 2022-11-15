package day5;

public class AddTwoNumbers {
	
	public static LinkedList AddListNumber(LinkedList listOne, LinkedList listTwo) {
		LinkedList result = new LinkedList();
		
		Node headOne = listOne.head;
		Node headTwo = listTwo.head;
		
		int rem = 0;
//		int digitPlace = 1;
		while(headOne != null && headTwo != null) {
			int tempSum = (headOne.data) + (headTwo.data) + rem;
			rem = tempSum/10;
//			if(rem != 0) tempSum/=10;
			result.addAtRear(tempSum%10);
			System.out.println("rem : "+rem+"\t ele : "+tempSum);
			headOne = headOne.next;
			headTwo = headTwo.next;
//			digitPlace *= 10;
		}
		
		while(headOne != null) {
			int tempSum = headOne.data + rem;
			rem = tempSum/10;
			
//			if(rem != 0) tempSum/=10;
			result.addAtRear(tempSum%10);
			
			headOne = headOne.next;
//			digitPlace *= 10;
		}
		while(headTwo != null) {
			int tempSum = headTwo.data + rem;
			rem = tempSum/10;
//			if(rem != 0) tempSum/=10;
			result.addAtRear(tempSum%10);
			
			headTwo = headTwo.next;
//			digitPlace *= 10;
		}
		if(rem!=0)result.addAtRear(rem);
		return result;
		
	}

	public static void main(String[] args) {
		LinkedList listOne = new LinkedList();
		LinkedList listTwo = new LinkedList();
		
//		listOne.addList(new int[] {2,4,3});
//		listTwo.addList(new int[] {5,6,4});
		listOne.addList(new int[] {9,9,9,9,9,9,9});
		listTwo.addList(new int[] {9,9,9,9});
		
		LinkedList answer = AddListNumber(listOne, listTwo);
		answer.printLinkedList();
	}

}
