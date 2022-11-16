package day05;

public class DeleteGivenNode {
	public static void deleteNode(Node node) {
		if(node == null) return;
		node.data = node.next.data;
		node.next = node.next.next;
		return;
	}
	public static void main(String[] args) {

	}

}
