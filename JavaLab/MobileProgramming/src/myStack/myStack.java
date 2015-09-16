package myStack;

public class myStack {
	Node top;
	
	int pop() {
		
		if (top == null) {
			System.out.println("Stack Pop >> ERROR: Stack is empty");
			return -1;
		}
		
		if (top.next == null) {
			int data = top.data;
			top = null;
			System.out.println("Stack Poped: " + data);
			return data;
		}
		
		Node n = top;
		Node preNode = null;
		
		while (n.next != null){
			preNode = n;
			n = n.next;
		}
		preNode.next = null;
		System.out.println("Stack Poped: " + n.data);
		return n.data;

	}
	
	void push(int data){
		if (top == null) {
			top = new Node(data);
			System.out.println(top.data);
			return ;
		}
		
		Node n = top;
		while (n.next != null){
			n = n.next;
		}
		
		n.next = new Node(data);
		System.out.println(n.next.data);		
	}
	
	int peek() {
		return top.data;
	}
}
