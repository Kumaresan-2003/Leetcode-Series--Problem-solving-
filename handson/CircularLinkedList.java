package com.handson;

class Node {
	int data;
	Node next;

	Node(int value) {
		data = value;
		next = null;
	}
}

public class CircularLinkedList {
	// 1
	static Node insertInEmptyList(Node last, int data) {
		if (last != null)
			return last;

		// Create a new node
		Node newNode = new Node(data);

		// Point newNode to itself
		newNode.next = newNode;

		// Update last to point to the new node
		last = newNode;
		return last;
	}

	// 2
	static void printList(Node last) {
		if (last == null) {
			return;
		}
		Node head = last.next;
		while (true) {
			System.out.print(head.data + " ");
			head = head.next;
			if (head == last.next) {
				break;
			}
			System.out.println();
		}
	}

	// 3
	static Node insertatbeg(Node last, int val) {
		Node newnode = new Node(val);
		if (last == null) {
			return newnode;
		}
		newnode.next = last.next;
		last.next = newnode;

		return last;
	}
    
	//
	static Node insertEnd(Node tail, int value) {
		Node newNode = new Node(value);
		if (tail == null) {
			return newNode;
		} else {
			newNode.next = tail.next;
			tail.next = newNode;
			tail = newNode;
		}
		return tail;
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1
//		Node last=null;
//		last=insertInEmptyList(last,1);
//		System.out.println();
//		printList(last);

		Node fir = new Node(2);
		fir.next = new Node(3);
		fir.next.next = new Node(4);
		Node last = fir.next.next;
		last.next = fir;
		// printList(last);

		// 3
		insertatbeg(last, 5);
		// printList(last);

		last = insertEnd(last, 6);
		printList(last);

	}

}
