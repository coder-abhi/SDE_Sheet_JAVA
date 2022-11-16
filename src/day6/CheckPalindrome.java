package day6;

import java.util.ArrayList;

public class CheckPalindrome {
	
	public static boolean checkPalindromeBruteForce(LinkedListGen<Character> list) {
		ArrayList<Integer> arr = new ArrayList<>();
		NodeGen<Character> currentNode = list.head;
		while(currentNode != null) {
			arr.add((int)currentNode.data);
			currentNode = currentNode.next;
		}
		int left = 0, right = arr.size()-1;
		while(left < right) {
			if(arr.get(left++) != arr.get(right--)) return false;
		}
		return true;
	}

	public static void main(String[] args) {
		LinkedListGen<Character> list = new LinkedListGen<>();
	
//		list.addList(new int[] {'a','b','c','d'});
		list.addAtRear('a');
		list.addAtRear('b');
		list.addAtRear('f');
		list.addAtRear('b');
		list.addAtRear('t');
		list.printLinkedList();
		
		System.out.println(checkPalindromeBruteForce(list));
		
	}

}
