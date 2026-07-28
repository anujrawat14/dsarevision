// Node class for Linked List
class Node {
    int data;      // Stores node value
    Node next;     // Stores reference to next node

    // Constructor to initialize data and next node
    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    // Constructor to initialize only data
    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

class Main {

    // Convert an array into a Linked List
    public static Node convertArrayToLL(int arr[]) {

        // First element becomes the head
        Node head = new Node(arr[0]);

        // Mover is used to build the remaining list
        Node mover = head;

        // Create nodes for remaining array elements
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);

            // Connect current node with new node
            mover.next = temp;

            // Move mover to the newly created node
            mover = temp;
        }

        return head;
    }

    // Print all nodes of the Linked List
    public static void printLL(Node head) {

        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // Delete the head node
    public static Node DeleteHeadLL(Node head) {

        // Empty list
        if (head == null)
            return null;

        // Move head to the next node
        head = head.next;

        return head;
    }

    // Delete the last node (tail)
    public static Node deleteTail(Node head) {

        // If list is empty or has only one node
        if (head == null || head.next == null)
            return null;

        Node temp = head;

        // Stop at the second last node
        while (temp.next.next != null) {
            temp = temp.next;
        }

        // Remove last node
        temp.next = null;

        return head;
    }

    // Delete kth node (1-based indexing)
    public static Node deleteKposLL(Node head, int k) {

        // Empty list
        if (head == null)
            return head;

        // Delete head separately
        if (k == 1) {
            head = head.next;
            return head;
        }

        Node temp = head;
        int counter = 1;

        // Reach (k-1)th node
        while (counter < k - 1 && temp != null) {
            temp = temp.next;
            counter++;
        }

        // Invalid k
        if (temp == null || temp.next == null)
            return head;

        // Skip kth node
        temp.next = temp.next.next;

        return head;
    }

    // Delete first occurrence of a given value
    public static Node deleteValueLL(Node head, int data) {

        // Empty list
        if (head == null)
            return null;

        // Value is present at head
        if (head.data == data) {
            head = head.next;
            return head;
        }

        Node temp = head;

        // Find node just before the target node
        while (temp.next != null && temp.next.data != data) {
            temp = temp.next;
        }

        // Value not found
        if (temp.next == null)
            return head;

        // Delete target node
        temp.next = temp.next.next;

        return head;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Convert array to Linked List
        Node head = convertArrayToLL(arr);

        // Uncomment any one operation to test

        // Node result = DeleteHeadLL(head);

        // Node result = deleteTail(head);

        Node result = deleteKposLL(head, 2);

        // Node result = deleteValueLL(head, 3);

        // Print final Linked List
        printLL(result);
    }
}
