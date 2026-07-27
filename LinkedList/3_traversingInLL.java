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

    public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        Node head = convertArrayToLl(arr);
 public static void main(String[] args) {

        int[] arr = {2, 4, 6, 8};

        Node head = convertArrayToLl(arr);

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }
}
