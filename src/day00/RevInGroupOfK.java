package day00;

public class RevInGroupOfK {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.addList(new int[] {1,2,3,4,5,6,7,8});
		list.revInK(3);
		list.printLinkedList();
	}

}
