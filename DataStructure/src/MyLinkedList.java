public class MyLinkedList {
	private Node head;

	public MyLinkedList(int d) {
		if (head == null)
			head = new Node(d);
		else
			head.next = new Node(d);
	}

	public void add(int d) {
		Node end = new Node(d);
		Node n = head;
		while (n.next != null) {
			n = n.next;
		}
		n.next = end;
	}

	public Node deleteNode(int d) {
		Node n = head;
		Node remove;
		if (n.data == d) {
			return n;
		}
		while (n.next != null) {
			if (n.next.data == d) {
				remove = n.next;
				n.next = n.next.next;
				return remove;
			}
			n = n.next;
		}
		return null;
	}

	public String toString() {
		StringBuffer result = new StringBuffer("[");
		Node n = head;
		while (n.next != null) {
			result.append(n.data + " ");
			n = n.next;
		}
		result.append(n.data + "]");
		return result.toString();
	}
}