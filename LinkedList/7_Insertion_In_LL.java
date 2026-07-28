class Node {
    int data;
    Node next;

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

        // Pointer used to build the linked list
        Node mover = head;

        // Create remaining nodes and link them
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    // Print all elements of the Linked List
    public static void printLL(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    // Insert a node at the beginning
    public static Node insertAtStart(Node head, int val) {
        Node temp = new Node(val, head);
        return temp;
    }

    // Insert a node at the end
    public static Node insertAtLast(Node head, int val) {

        // If list is empty, new node becomes head
        if (head == null)
            return new Node(val);

        Node temp = head;

        // Traverse to the last node
        while (temp.next != null) {
            temp = temp.next;
        }

        // Attach new node at the end
        Node temp1 = new Node(val, null);
        temp.next = temp1;

        return head;
    }

    // Insert a node at the kth position (1-based indexing)
    public static Node insertAtK(Node head, int val, int k) {

        // Insert at first position
        if (k == 1)
            return new Node(val, head);

        // Empty list
        if (head == null)
            return null;

        int count = 1;
        Node temp = head;

        // Reach the (k-1)th node
        while (count < k - 1 && temp != null) {
            count++;
            temp = temp.next;
        }

        // Invalid position
        if (temp == null)
            return head;

        // Insert new node
        Node temp1 = new Node(val, temp.next);
        temp.next = temp1;

        return head;
    }

    // Insert a node before the given value
    public static Node insertValue(Node head, int val, int before) {

        // Empty list
        if (head == null)
            return null;

        // If value is present at head
        if (head.data == before)
            return new Node(val, head);

        Node temp = head;

        // Find the node just before the target value
        while (temp.next != null && temp.next.data != before) {
            temp = temp.next;
        }

        // Value not found
        if (temp.next == null)
            return head;

        // Insert new node before the target value
        Node temp2 = new Node(val, temp.next);
        temp.next = temp2;

        return head;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        // Create Linked List from array
        Node head = convertArrayToLL(arr);

        // Uncomment any one operation to test

        // head = insertAtStart(head, 0);

        // head = insertAtLast(head, 6);

        // head = insertAtK(head, 35, 3);

        head = insertValue(head, 35, 3);

        // Print the final Linked List
        printLL(head);
    }
}
