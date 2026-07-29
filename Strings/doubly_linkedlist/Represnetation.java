class Node{
    public int data;
    public Node next;
    public Node prev;
    
    public Node(int data1,Node prev1,Node next1){
        this.data=data1;
        this.prev=prev1;
        this.next=next1;
    }
   
    public Node(int data1){
        this.data=data1;
        this.next=null;
        this.prev=null;
    }
}
