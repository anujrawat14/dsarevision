// Online Java Compiler
// Use this editor to write, compile and run your Java code online
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
class Main {
    private static Node convertArray(int arr[]){
        Node head=new Node(arr[0]);
        Node prev=head;
        for(int i=1;i<arr.length;i++){
            Node temp=new Node(arr[i],prev,null);
            prev.next=temp;
            prev=temp;
        }
        return head;
    }
    
    private static void printDll(Node head) {
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    
    private static Node DeleteHead(Node head){
        if(head == null) return null;
        head=head.next;
        if(head!=null){
            head.prev=null;
          }
        return head;
    }
    
    private static Node deleteTail(Node head){
        if(head==null || head.next==null) return null;
        
        Node temp=head;
        while(temp.next!=null ){
            temp=temp.next;
        }
        // if(temp==null) return temp;
        temp.prev.next=null;
        temp.prev=null;
    
        
        return head;
    }
   private static Node deleteAtK(Node head, int k) {

    if (head == null)
        return null;

    if (k == 1)
        return DeleteHead(head);

    int count = 1;
    Node temp = head;

    while (temp != null && count < k) {
        temp = temp.next;
        count++;
    }

    if (temp == null)
        return head;

    if (temp.next != null) {
        temp.next.prev = temp.prev;
    }

    if (temp.prev != null) {
        temp.prev.next = temp.next;
    }

    temp.next = null;
    temp.prev = null;

    return head;
}
   
    private static Node deletek(Node head, int k){
        if(head==null)return null;
        if(k==head.data){
            return DeleteHead(head);
        }
        Node temp=head;
        while(temp.data != k){
            
            //value mil gyi jisko delet krna hai
            temp=temp.next;
        }
        if(temp == null) return head;
        if(temp.next!=null){
            temp.next.prev=temp.prev;
        }
        temp.prev.next=temp.next;
        
        temp.next=null;
        temp.prev=null;
        
        return head;
        
    } 
    public static void main(String[] args) {
       
       int arr[]={10,20,30,40};
    //   int arr[]={10};
        Node result=convertArray(arr);
        //Node ans=DeleteHead(result);
        // Node ans=deleteTail(result);
        // Node ans=deleteAtK(result,3);
        Node ans=deletek(result,10);
        printDll(ans);
        
    }
}
