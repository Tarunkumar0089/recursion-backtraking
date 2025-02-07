public class linked { 
    class Node {
        int val;
        Node next;
    }
    Node head = null;
    Node tail = null;
    int size = 0;

    // Add a node at the beginning
    public void addFirst(int val) {
        Node nn = new Node();
        nn.val = val;
        if (head == null) {
            head = nn;
            tail = nn;     
        } else {
            nn.next = head;
            head = nn;
        }
        size++;
    }
    // Add a node at the end
    public void addLast(int val) {
        Node nn = new Node();
        nn.val = val;  // Missing in your code
        if (head == null) {
            head = nn;
            tail = nn;
        } else {
            tail.next = nn;
            tail = nn;
        }
        size++;
    }

    // Remove the first node
    public void removeFirst() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        head = head.next;
        if (head == null) { // If the list becomes empty, update tail as well
            tail = null;
        }
        size--;
    }

    // Remove the last node
    public void removeLast() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }
        if (head == tail) { // Only one element in the list
            head = null;
            tail = null;
            size--;
            return;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        temp.next = null;
        tail = temp;
        size--;
    }

    // Display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
        System.out.println("null");
    }
}