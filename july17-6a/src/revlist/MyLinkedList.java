package revlist;

class Node {
	int data;
	Node next;
	
	Node(int data){
		this.data = data;
	}
}

public class MyLinkedList {

	Node head;
	
	Node reverse(Node head) {
		Node prev = null;
		Node curr = head;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next =prev;
			prev = curr;
			curr = next;
		}
		
		head = prev;
		return head;
	}
	
	public void printList(Node head) {
		while(head != null) {
			System.out.print(head.data + "  ");
			head = head.next;
		}
		System.out.println();
	}
	public static void main(String[] args) {
		MyLinkedList list = new MyLinkedList();
		
		list.head = new Node(10);
		
		list.head.next = new Node(20);
		list.head.next.next = new Node(30);
		list.head.next.next.next = new Node(40);
		System.out.println("After List Creation ");
		list.printList(list.head);
		System.out.println("After Reversing ");
		list.head = list.reverse(list.head);
		list.printList(list.head);
	}
}