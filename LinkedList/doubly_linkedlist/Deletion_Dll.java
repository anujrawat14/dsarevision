// Delete the head node
private static Node DeleteHead(Node head) {
    if (head == null) return null;

    head = head.next;

    if (head != null) {
        head.prev = null;
    }

    return head;
}

// Delete the tail node
private static Node deleteTail(Node head) {
    if (head == null || head.next == null) return null;

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

// Delete the node at the kth position
private static Node deleteAtK(Node head, int k) {

    if (head == null) return null;

    // Delete head
    if (k == 1) return DeleteHead(head);

    int count = 1;
    Node temp = head;

    // Reach the kth node
    while (temp != null && count < k) {
        temp = temp.next;
        count++;
    }

    // Position doesn't exist
    if (temp == null) return head;

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

// Delete the node having value k
private static Node deletek(Node head, int k) {

    if (head == null) return null;

    // Delete head if it contains k
    if (head.data == k) return DeleteHead(head);

    Node temp = head;

    // Find the node with value k
    while (temp != null && temp.data != k) {
        temp = temp.next;
    }

    // Value not found
    if (temp == null) return head;

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
