// Online Java Compiler
// Use this editor to write, compile and run your Java code online
class Node{
    int data;
    Node next;
    Node(int data1,Node next1){
        this.data=data1;
        this.next=next1;
    }
    Node(int data1){
        this.data=data1;
        this.next=null;
    }
}
class Main {
    public static Node convertArrayToLL(int arr[]){
        Node head=new Node(arr[0]);
        Node mover=head;
       
            for(int i=1;i<arr.length;i++){
                Node temp=new Node(arr[i]);
                mover.next=temp;
                mover=temp;
            }
        return head;
    }
    public static void printLL(Node head){
        while(head != null){
            System.out.println(head.data);
            head=head.next;
        }
    }
    public static Node DeleteHeadLL(Node head){
        if(head==null) return null;
        
        Node temp=head;
        head=head.next;
        
        return head;
    }
    public static Node deleteTail(Node head){
        if(head == null || head.next==null) return null;
        Node temp=head;
        while(temp.next.next !=null){
            temp=temp.next;
        }
        temp.next=null; 
        return head;
    }
    public static Node deleteKposLL(Node head ,int k){
      if(head==null) return head;//everytime this edge case come
        
        if(k==1){
            Node temp=head;
            head=head.next;
            return head;
        }
        
            Node temp=head;
            int counter=1;
            while(counter < k-1 && temp != null){
                temp=temp.next;
                counter++;
            }
            if(temp==null || temp.next==null) return head;
            
            temp.next=temp.next.next;//prev link next ka next sa
    
        return head;
    }
  
    public static Node deleteValueLL(Node head,int data){
        if (head==null ) return null;
        if(head.data==data){
            Node temp=head;
            head=head.next;
            return head;
        }
        Node temp=head;
        while(temp.next != null && temp.next.data!=data ){
            temp=temp.next;
        }
        if(temp.next==null )return head;
        
        temp.next=temp.next.next;
        
        return head;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        Node head=convertArrayToLL(arr);
    //   Node result= DeleteHeadLL(head);
    // Node result =deleteTail(head);
    Node result=deleteKposLL(head,2);
    // Node result=deleteValueLL(head,3);
       printLL(result);
        
    }
}
