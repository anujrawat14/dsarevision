public static Node insertHead(Node head, int data) {
    if (head == null) {
        return new Node(data);
    }

    Node temp = new Node(data);
    temp.next = head;
    head.prev = temp;

    return temp;
}
