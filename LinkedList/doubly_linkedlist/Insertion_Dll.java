public static Node insertHead(Node head, int data) {
    if (head == null) {
        return new Node(data);
    }

    Node temp = new Node(data);
    temp.next = head;
    head.prev = temp;

    return temp;
}
public static Node insertTail(Node head, int data) {
    if (head == null) {
        return new Node(data);
    }

    Node temp = head;

    // Traverse to the last node
    while (temp.next != null) {
        temp = temp.next;
    }

    // Create the new node
    Node temp2 = new Node(data, null, temp);

    // Link the last node to the new node
    temp.next = temp2;

    return head;
}
