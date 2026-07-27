class Node {
    int data;
    Node next;

    // Constructor to create a node with data and next pointer
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor to create a node with only data
    // next is initialized to null
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {

    // Converts an array into a Singly Linked List
    public static Node convertArrayToLL(int[] arr) {

        // Edge case: empty array
        if (arr.length == 0)
            return null;

        // Step 1: Create the head node using the first element
        Node head = new Node(arr[0]);

        // Step 2: 'mover' always points to the last node
        // Initially, head is the only node
        Node mover = head;

        // Step 3: Traverse the remaining array elements
        for (int i = 1; i < arr.length; i++) {

            // Create a new node
            Node temp = new Node(arr[i]);

            // Attach the new node to the end of the list
            mover.next = temp;

            // Move mover to the newly added node
            mover = temp;
        }

        // Return the head of the linked list
        return head;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        // Convert array to linked list
        Node head = convertArrayToLL(arr);

        // Print linked list
        printLL(head.data);
    }
}
