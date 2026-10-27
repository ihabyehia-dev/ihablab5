package lab5;

public class DoubleLinked {
	Node head;
	Node tail;

	public boolean isempty() {
		boolean ok = false;
		if (head == null) {
			ok = true;
			return ok;
		}
		return ok;
	}

	void insertatfront(int v) {
		Node n = new Node(v);

		n.next = head;
		head = n;
	}

	void insertatback(int v) {
		Node n = new Node(v);

		Node current = head;
		Node prev = current;

		if (isempty() == true) {
			head = n;
		}

		while (current.next != null) {
			prev = current;
			current = current.next;
		}
		n.prev = current;
		current.next = n;
	}

	void insertatkey(int key, int v) {
		Node n = new Node(v);
		Node current = head;
		Node prev = current;

		while (current != null && current.data != key) {
			prev = current;
			current = current.next;
		}
		n.prev = current.prev;
		n.next = current;
		current.prev.next = n;
		current.prev = n;
	}

	void deletefromfront() {
		if (isempty() == true) {
			return;
		}
		if (head == tail) {
			head = null;
			return;
		}
		head = head.next;
		head.prev = null;
	}

	void deletefromback() {
		if (isempty() == true) {
			return;
		}
		if (head == tail) {
			head = null;
			return;
		}
		Node current = head;
		Node prev = current;

		while (current.next != null) {
			prev = current;
			current = current.next;
		}
		tail = current.prev;
		tail.next = null;
	}

	void deleteByvalue(int key) {
		if (head.data == key) {
			head = null;
		}
		if (tail.data == key) {
			tail = null;
		}
		Node current = head;
		Node prev = current;

		while (current.data != key && current != null) {
			prev = current;
			current = current.next;
		}
		current.next.prev = prev;
		prev.next.next = current.next;
	}

	public int searchrecursive(int key) {
		return recursions(head, key,0);
	}

	int recursions(Node n, int key, int index) {
		if (n == null) {
			return -1;
		}
		if (n.data == key) {
			return index;
		}
		return recursions(n.next, key, index + 1);
	}

	void displayforward() {
		Node current = head;
		while (current != null) {
			System.out.print(current.data + ",");
			current = current.next;
		}
	}

	void displaybackward() {
		Node current = tail;
		while (current != null) {
			System.out.print(current.data + ",");
			current = current.prev;
		}
	}

	void reverse() {
		Node n = new Node();
		Node temp;
		if (isempty() == true) {
			return;
		}
		if (head == tail) {
			return;
		}
		Node current = head;
		Node prev = current;
		Node cur = current;
		while (current.next != null) {
			prev = current.next;
			cur = current.prev;
			current = current.next;
		}
		temp = head;
		head=tail.prev.next;
		tail=head;
	}
	
	Node s = new Node();
	
	
}
