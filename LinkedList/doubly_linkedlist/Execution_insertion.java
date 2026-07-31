// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    Node next;
    Node prev;
    int data;
    Node(int data1,Node next1,Node prev1){
        this.data=data1;
        this.next=next1;
        this.prev=prev1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
        this.prev=null;
    }
}
class Main {
    public static Node convertArray(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],null ,prev);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    public static void print(Node head){
        if(head==null) return;
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static Node insertHead(Node head,int data){
        if(head==null){
             Node temp=new Node(data);
             return temp;
         }
         Node temp=new Node(data);
         temp.next=head;
         head.prev=temp;
         return temp;
        
    }
    public static Node insertTail(Node head,int data){
        if(head==null){
            Node temp=new Node(data);
            return temp;
        } 
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        Node temp2=new Node(data,null,temp);
        temp.next=temp2;
        return head;
    }
    public static Node insertAtK(Node head, int data, int k) {

    if (head == null || k == 1) {
        return insertHead(head, data);
    }

    Node temp = head;
    int counter = 1;

    while (temp != null && counter < k - 1) {
        temp = temp.next;
        counter++;
    }

    if (temp == null) {
        return head;
    }

    if (temp.next == null) {
        Node temp2 = new Node(data, null, temp);
        temp.next = temp2;
    } else {
        Node temp2 = new Node(data, temp.next, temp);
        temp.next.prev = temp2;
        temp.next = temp2;
    }

    return head;
}
    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
       Node ans= convertArray(arr);
    //   Node res=insertHead(ans,1);
    //   Node res= insertTail(ans,7);
    Node res=insertAtK(ans,35,3);
      print(res);
      
    }
}
