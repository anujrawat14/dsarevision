private static void printDll(Node head) {
  
    while (head != null) {
         System.out.print(head.data + " ");
         head = head.next;
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
