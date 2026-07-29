class Node {
    public int data;
    public Node next;

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {

    // Convert Array to Linked List
    public static Node convertArrayToLl(int[] arr) {

        if (arr.length == 0)
            return null;

        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    // Search for a value in the linked list
    public static boolean checkValue(Node head, int value) {

        Node temp = head;

        while (temp != null) {

            // Value found
            if (temp.data == value) {
                return true;
            }

            // Move to the next node
            temp = temp.next;
        }

        // Value not found
        return false;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        Node head = convertArrayToLl(arr);

        System.out.println(checkValue(head, 6)); // true
        System.out.println(checkValue(head, 10)); // false
    }
}
