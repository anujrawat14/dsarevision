
//brute approach:-

//use an array to store all values of dll O(n)  extra space;
//then simplue use insert at tail function to add the elemnts in dll O(n) extra space for new dlll +O(n) to add elemnts
//total complexity are extra space=o(2n) and time =o(n)

//optimal approach:-
//use two pointer approach 
//then sawp their data

public static Node tail(Node head) {
    Node tail = head;

    while (tail.next != null) {
        tail = tail.next;
    }

    return tail;
}

public static void swap(Node left, Node right) {
    int temp = right.data;
    right.data = left.data;
    left.data = temp;
}

public static Node reverse(Node head) {

    if (head == null || head.next == null)
        return head;

    Node i = head;
    Node j = tail(head);

    while (i != j && i.prev != j) {
        swap(i, j);
        i = i.next;
        j = j.prev;
    }

    return head;
}
