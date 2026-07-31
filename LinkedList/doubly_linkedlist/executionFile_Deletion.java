// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class Node {
    public int data;
    public Node next;
    public Node prev;

    public Node(int data1, Node prev1, Node next1) {
        this.data = data1;
        this.prev = prev1;
        this.next = next1;
    }

    public Node(int data1) {
        this.data = data1;
        this.next = null;
        this.prev = null;
    }
}

class Main {

    // Convert array to Doubly Linked List
    private static Node convertArray(int arr[]) {
        Node head = new Node(arr[0]);
        Node prev = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i], prev, null);
            prev.next = temp;
            prev = temp;
        }

        return head;
    }

    // Print Doubly Linked List
    private static void printDll(Node head) {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }

        System.out.println();
    }

    // Delete head node
    private static Node DeleteHead(Node head) {

        if (head == null)
            return null;

        head = head.next;

        if (head != null) {
            head.prev = null;
        }

        return head;
    }

    // Delete tail node
    private static Node deleteTail(Node head) {

        if (head == null || head.next == null)
            return null;

        Node temp = head;

        // Reach the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Remove the last node
        temp.prev.next = null;
        temp.prev = null;

        return head;
    }

    // Delete node at kth position
    private static Node deleteAtK(Node head, int k) {

        if (head == null)
            return null;

        // Delete head
        if (k == 1)
            return DeleteHead(head);

        int count = 1;
        Node temp = head;

        // Reach the kth node
        while (temp != null && count < k) {
            temp = temp.next;
            count++;
        }

        // Position doesn't exist
        if (temp == null)
            return head;

        // Update next node
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        // Update previous node
        if (temp.prev != null) {
            temp.prev.next = temp.next;
        }

        // Detach the node
        temp.next = null;
        temp.prev = null;

        return head;
    }

    // Delete node having value k
    private static Node deletek(Node head, int k) {

        if (head == null)
            return null;

        // Delete head if it contains k
        if (head.data == k)
            return DeleteHead(head);

        Node temp = head;

        // Find the node having value k
        while (temp != null && temp.data != k) {
            temp = temp.next;
        }

        // Value not found
        if (temp == null)
            return head;

        // Update next node
        if (temp.next != null) {
            temp.next.prev = temp.prev;
        }

        // Update previous node
        temp.prev.next = temp.next;

        // Detach the node
        temp.next = null;
        temp.prev = null;

        return head;
    }

    public static void main(String[] args) {

        int arr[] = {10, 20, 30, 40};

        Node head = convertArray(arr);

        // head = DeleteHead(head);

        // head = deleteTail(head);

        // head = deleteAtK(head, 3);

        head = deletek(head, 10);

        printDll(head);
    }
}
