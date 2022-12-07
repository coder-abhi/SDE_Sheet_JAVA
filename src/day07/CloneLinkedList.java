package day07;

public class CloneLinkedList {
	
	
	// Definition for a Node.
	class Node {
	    int val;
	    Node next;
	    Node random;

	    public Node(int val) {
	        this.val = val;
	        this.next = null;
	        this.random = null;
	    }
	}
	

	class Solution {
	    public Node copyRandomList(Node head) {
	        if(head == null) return null;
	        
	        Node curr = head;
	        while(curr != null){
	            Node copyNode = new Node(curr.val);
	            copyNode.next = curr.next;
	            curr.next= copyNode;
	            
	            curr = curr.next.next ;
	        }
	        
	        
	        curr = head;
	        Node copyCurr = head.next;
	        while(curr != null){
	           
	            if(curr.random != null) copyCurr.random = curr.random.next;
	            else copyCurr.random = null;
	            
	            curr = copyCurr.next;
	            if(curr != null) copyCurr = curr.next;
	         
	        }
	        
	        curr = head;
	        
	        Node newHead = head.next;
	        copyCurr = head.next;
	        while(curr != null){

	            curr.next = copyCurr.next;
	            curr = curr.next;
	            if(curr != null){
	                copyCurr.next = curr.next;
	                copyCurr = copyCurr.next;     
	            }
	         
	        }

	    return newHead;
	    }
	}

	public static void main(String[] args) {

	}

}
