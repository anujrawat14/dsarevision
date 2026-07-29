//deletion at head
 private static Node DeleteHead(Node head){
        if(head == null) return null;
       head=head.next;
        if(head!=null){
            head.prev=null;
          }
        return head;
 }

//delet at tail
 private static Node deleteTail(Node head){
        if(head==null || head.next==null) return null;
        
        Node temp=head;
        while(temp.next!=null ){
            temp=temp.next;
        }
        //temp have 40
        temp.prev.next=null;//40.prev=30.next=null
        temp.prev=null;//40.prev=null;

        return head;
}

//delete at k position
private static Node deleteAtK(Node head, int k) {

    if (head == null)
        return null;

    if (k == 1) //head delete
        return deleteHead(head);

    int count = 1;
    Node temp = head;

    while (temp != null && count < k) {
      //temp ki woh value milegi jiko delet krna hai
        temp = temp.next;
        count++;
    }

    if (temp == null)
        return head;

    if (temp.next != null) { //agr uska bad bhi koi elemnt hai toh
        temp.next.prev = temp.prev;
    }

    if (temp.prev != null) { //agr us aphla koi elemnt hai toh
        temp.prev.next = temp.next;
    }

    temp.next = null;
    temp.prev = null;

    return head;
}

//delete at k value
private static Node deletek(Node head, int k) {

    // Empty list
    if (head == null)
        return null;

    // Delete head if it contains the given value
    if (head.data == k)
        return DeleteHead(head);

    Node temp = head;

    // Find the node with value k
    while (temp != null && temp.data != k) {
        temp = temp.next;
    }

    // Value not found
    if (temp == null)
        return head;

    // Update the next node's previous pointer
    if (temp.next != null) {
        temp.next.prev = temp.prev;
    }

    // Update the previous node's next pointer
    temp.prev.next = temp.next;

    // Detach the node
    temp.next = null;
    temp.prev = null;

    return head;
}
