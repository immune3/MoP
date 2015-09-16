public class LinkedListTest {
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList(0);
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println(list);
		list.deleteNode(2);
		System.out.println(list);
	}

}