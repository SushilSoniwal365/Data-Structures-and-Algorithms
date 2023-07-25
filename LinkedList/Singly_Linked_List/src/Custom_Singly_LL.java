public class Custom_Singly_LL {
    Node head;
    int size;

    Custom_Singly_LL() {
        size = 0;
    }

    /* ********** INSERTION IN SINGLY LINKED LIST ********** */

    // (1) Insert At First Position.
    public void insertFirst(int value) {
        Node node = new Node(value);
        node.next = head;
        head = node;
        size++;
    }

    // (2) Insert At Last Position.
    public void insertLast(int value) {
        Node node = new Node(value);

        // Check If List Is Empty.
        if (head == null) {
            insertFirst(value); // Add Node At First Index.
            return;
        }

        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = node;
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
        Node node = new Node(val, temp.next);
        temp.next = node;
        size++;
    }

    /* ********** DELETION IN SINGLY LINKED LIST ********** */

    // (1) Delete First Node.
    public void deleteFirst() {
        // If list is empty.
        if (head == null) {
            System.out.println("List is already empty");
        }
        head = head.next;
        size--;
    }

    // (2) Delete Last Node.
    public void deleteLast() {
        // If list is empty.
        if (head == null) {
            System.out.println("List is already empty");
            return;
        }

        // If list has only one node.
        if (head.next == null) {
            head = null;
            return;
        }

        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;
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
        size--;
    }

    /* !********* FIND THE TARGET NODE ********** */
    public Node find(int val) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null; // Not Found
    }

    /* !********* Method To Display Singly Linked List ********** */
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

        Node(int data) {
            this.data = data;
        }

        Node(int data, Node next) {
            this.data = data;
            this.next = next;
        }
    }
}
