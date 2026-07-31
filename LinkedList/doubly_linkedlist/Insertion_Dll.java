// ------------------------------------------------------------
// Insert a node at the beginning (Head)
// Time Complexity: O(1)
// ------------------------------------------------------------
public static Node insertHead(Node head, int data) {

    // If the list is empty, the new node becomes the head.
    if (head == null) {
        return new Node(data);
    }

    // Create the new node.
    Node temp = new Node(data);

    // Link the new node with the current head.
    temp.next = head;
    head.prev = temp;

    // Return the new head.
    return temp;
}

// ------------------------------------------------------------
// Insert a node at the end (Tail)
// Time Complexity: O(n)
// ------------------------------------------------------------
public static Node insertTail(Node head, int data) {

    // If the list is empty, the new node becomes the head.
    if (head == null) {
        return new Node(data);
    }

    Node temp = head;

    // Traverse to the last node.
    while (temp.next != null) {
        temp = temp.next;
    }

    // Create the new node.
    // next = null (last node)
    // prev = temp (current last node)
    Node temp2 = new Node(data, null, temp);

    // Connect the current last node to the new node.
    temp.next = temp2;

    return head;
}

// ------------------------------------------------------------
// Insert a node at the K-th position (1-based indexing)
// Time Complexity: O(n)
// ------------------------------------------------------------
public static Node insertAtK(Node head, int data, int k) {

    // If inserting at the first position.
    if (head == null || k == 1) {
        return insertHead(head, data);
    }

    Node temp = head;
    int counter = 1;

    // Move to the (k-1)th node.
    while (temp != null && counter < k - 1) {
        temp = temp.next;
        counter++;
    }

    // If k is greater than the length of the list.
    if (temp == null) {
        return head;
    }

    // Case 1: Insert at the end.
    if (temp.next == null) {

        Node temp2 = new Node(data, null, temp);
        temp.next = temp2;

    }
    // Case 2: Insert in the middle.
    else {

        // New node points to temp.next and temp.
        Node temp2 = new Node(data, temp.next, temp);

        // Update the backward link of the next node.
        temp.next.prev = temp2;

        // Update the forward link of temp.
        temp.next = temp2;
    }

    return head;
}

// ------------------------------------------------------------
// Insert a node after a given value
// Time Complexity: O(n)
// ------------------------------------------------------------
public static Node insertAfterValue(Node head, int value, int data) {

    // Empty list.
    if (head == null) {
        return null;
    }

    Node temp = head;

    // Search for the given value.
    while (temp != null && temp.data != value) {
        temp = temp.next;
    }

    // Value not present.
    if (temp == null) {
        return head;
    }

    // Case 1: Value found at the last node.
    if (temp.next == null) {

        Node newNode = new Node(data, null, temp);
        temp.next = newNode;

    }
    // Case 2: Value found in the middle.
    else {

        // Create the new node.
        Node newNode = new Node(data, temp.next, temp);

        // Update backward pointer of the next node.
        temp.next.prev = newNode;

        // Connect current node to the new node.
        temp.next = newNode;
    }

    return head;
}
