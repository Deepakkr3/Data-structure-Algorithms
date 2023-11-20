public class Stack {
    Node head;
    Node tail;
    public void insertBeg(int value){
        Node newNode = new Node();
            newNode.value=value;
        if(head == null){
            
            newNode.next=null;
            head=tail=newNode;
        }else{
          newNode.next=head;
          head=newNode;
        }
      
    }
    public int deleteBeg(){
        if(head==null){
            
            return Integer.MIN_VALUE;
        }else{
            int val=head.value;
            head=head.next;
            return val;
            
        }
      
    }
     public int peek(){
        if(head==null){
            
            return Integer.MIN_VALUE;
        }else{
            int val=head.value;
          
            return val;
            
        }
      
    }
    
}
