class Node {
    int data;
    Node next;

    Node(int data1, Node next1) {
        this.data = data1;
        this.next = next1;
    }

    Node(int data1) {
        this.data = data1;
        this.next = null;
    }
}

class Main {

    public static Node convertArrayToLL(int arr[]) {
        Node head = new Node(arr[0]);
        Node mover = head;

        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }

        return head;
    }

    public static void printLL(Node head) {
        while (head != null) {
            System.out.println(head.data);
            head = head.next;
        }
    }

    public static Node insertAtStart(Node head, int val) {
            Node temp = new Node(val, head);
             return temp;
    }
    public static Node insertAtLast(Node head, int val) {
       
       if(head == null)  return new Node(val);
       
       Node temp=head;
       
       while(temp.next!=null ){
           temp=temp.next;
       }
      Node temp1=new Node(val,null);
       temp.next=temp1;
       return head;
       
    }
    
     public static Node insertAtK(Node head,int val,int k){
         
         if(k==1)  return new Node(val,head);
         if(head==null) return null;
         
         int count=1; Node temp=head;
         while(count<k-1 && temp != null){
             count++;
             temp=temp.next;
         }
         if(temp == null) return head;
         Node temp1=new Node(val,temp.next);
         temp.next=temp1;
         return head;
         
     }
     
     public static Node insertValue(Node head,int val,int before){
         if(head==null) return null;
         if(head.data==before) return new Node(val,head);
         Node temp=head;
         while(temp.next!=null && temp.next.data != before){
             temp=temp.next;
         }
         if(temp.next==null) return head;
         Node temp2=new Node(val,temp.next);
         temp.next=temp2;
         return head;
     }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        Node head = convertArrayToLL(arr);
        // head = insertAtStart(head, 0);
       //head= insertAtLast(head,6)
        // head= insertAtK(head,35,3);
        head=insertValue(head,35,3);

        printLL(head);
    }
}
