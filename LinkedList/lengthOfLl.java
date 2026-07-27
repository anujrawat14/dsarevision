// Node class represents one node of the Linked List
class Node {

    int data;
    Node next;

    // Constructor to create a node with data and next node
    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    // Constructor to create a node with only data
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Main {

    // Function to convert an array into a Linked List
    public static Node convertArrayToLL(int[] arr) {

        // If array is empty, return null
        if (arr.length == 0)
            return null;

        // Create the head node
        Node head = new Node(arr[0]);

        // Mover always points to the last node
        Node mover = head;

        // Create and link the remaining nodes
        for (int i = 1; i < arr.length; i++) {

            Node temp = new Node(arr[i]);

            mover.next = temp;

            mover = temp;
        }

        return head;
    }

    // Function to calculate the length of the Linked List
    public static int calculateLengthLL(Node head) {

        int count = 0;
        Node temp = head;

        while (temp != null) {
            count++;
            temp = temp.next;
        }

        return count;
    }

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8, 10};

        // Convert array to Linked List
        Node head = convertArrayToLL(arr);

        // Print only the length
        System.out.println("Length = " + calculateLengthLL(head));
    }
}
