private static void printDll(Node head) {
  
    Node temp = head;

   while (temp != null) {
    System.out.print(temp.data + " ");
    temp = temp.next;
    }

    // if (head == null) {
    //     System.out.println("No linked list exists");
    //     return;
    // }

    // Node temp = head;

    // while (temp != null) {
    //     if (temp.next != null) {
    //         System.out.print(temp.data + " <-> ");
    //     } else {
    //         System.out.print(temp.data);
    //     }
    //     temp = temp.next;
    // }

    // System.out.println();
}
