private static Node convertArray(int arr[]) {
    Node head = new Node(arr[0]);   // Create the first node
    Node prev = head;               // Keep track of the last node

    for (int i = 1; i < arr.length; i++) {
        Node temp = new Node(arr[i], prev, null); // New node

        prev.next = temp;  // Connect previous node to new node
        prev = temp;       // Move prev to the new node
    }

    return head;
}
