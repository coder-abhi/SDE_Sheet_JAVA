package day06;

import java.util.ArrayList;

public class CheckPalindrome {
	public static boolean checkPallindrome(LinkedListGen<Character> list) {
		// finding middle of list
		NodeGen<Character> slow = list.head;
		NodeGen<Character> fast = list.head;
		
		while(fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		
		// we got middle ie. slow pointer
		
		// reverse remaining list
		NodeGen<Character> prev = null;
		NodeGen<Character> curr = slow.next;
		NodeGen<Character> next;
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			
			prev = curr;
			curr = next;
		}
		slow.next = prev;
		
		slow = slow.next;
		fast = list.head;
		while(slow != null) {
//			System.out.println("slow : "+ slow.data + "\tfast : "+fast.data);
			if(slow.data != fast.data) return false;
			slow = slow.next;
			fast = fast.next;
		}
		return true;
	}
	
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
		list.addAtRear('f');
		list.addAtRear('b');
		list.addAtRear('a');
		list.printLinkedList();
		
//		System.out.println(checkPalindromeBruteForce(list));
		System.out.println(checkPallindrome(list));
		list.printLinkedList();
		
	}

}
