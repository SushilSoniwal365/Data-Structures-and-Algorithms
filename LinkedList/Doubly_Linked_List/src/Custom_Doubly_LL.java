public class Custom_Doubly_LL {

    public Node head;
    public int size;

    public Custom_Doubly_LL() {
        size = 0;
    }

    /* ********** INSERTION IN DOUBLY LINKED LIST ********** */

    // (1) Insert At First Position.
    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.previous = null;

        if (head != null) {
            head.previous = node;
        }
        head = node;
        size++;
    }

    // (2) Insert At Last Position.
    public void insertLast(int val) {
        Node node = new Node(val);

        if (head == null) {
            head = node;
            node.previous = null;
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
        node.previous = temp;
        node.next = null;
        size++;
    }

    // (3) Insert At A Target Index.
    public void insert(int val, int index) {
        if (index == 0) {
            insertFirst(val);
            return;
        }
        if (index == size) {
            insertLast(val);
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }

        Node node = new Node(val);
        node.next = temp.next;
        temp.next.previous = node;
        temp.next = node;
        node.previous = temp;
        size++;
    }

    /* ********** DELETION IN DOUBLY LINKED LIST ********** */

    // (1) Delete First Node.
    public void deleteFirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        head = head.next;
        head.previous = null;
        size--;
    }

    // (2) Delete Last Node.
    public void deleteLast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.previous.next = null;
        size--;
    }

    // (3) Delete the node of a target index.
    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
            return;
        }
        if (index == size) {
            deleteLast();
            return;
        }

        Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        temp.next = temp.next.next;
        temp.next.previous = temp;
        size--;
    }

    // Method To Display Linked List.
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("End");
    }

    static class Node {
        int data;
        Node next;
        Node previous;

        public Node(int data) {
            this.data = data;
        }

        public Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }

        public Node(int data, Node next, Node previous) {
            this.data = data;
            this.next = next;
            this.previous = previous;
        }
    }
}
