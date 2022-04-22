package by.academy.classwork.lesson14.linckedList;

public class LinkedListCustom<T> {

	private Node head;
	private Node tail;
	private long size = 0;

	public void add(T value) {
		Node newNode = new Node(value);
		if (head == null) {
			tail = newNode;
			head = newNode;
		} else {
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;

		}
		size++;
	}

	public void add(int index, T value) {
		if (index < 0 || index > size - 1) {
			System.err.println("Index of bound exception");
			return;
		}
		Node newNode = new Node(value);
		if (index == 0) {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
			size++;
			return;
		} else if (index == size) {
			newNode.prev = tail;
			tail.next = newNode;
			tail = newNode;
			size++;
			return;
		}
		Node indexNode = getNode(index);
		
		Node next = indexNode.next;
		Node prev = indexNode.prev; 
		prev.next = newNode;
		next.prev = newNode;
		size--;
		size++;
	}

	private Node getNode(int index) {
		if (index < 0 || index > size - 1) {
			System.err.println("Index of bound exception");
			return null;
		}
		int counter = 0;
		Node currentNode = head;
		while (index < counter) {
			currentNode = currentNode.next;
			counter++;
		}
		return currentNode;
	}

	public T get(int index) {
		Node node = getNode(index);
		return node.value;
	}

	class Node {
		T value;
		Node prev;
		Node next;

		public Node(T value) {
			super();
			this.value = value;
		}
	}
}
