public class Stack {
    Node head;
    Node tail;
    
    public void createStack(int value)
    {
        head = new Node();
        Node newNode = new Node();
        newNode.value=value;
        newNode.next=null;
        head=tail=newNode;
      
       
    }
    //push
    public void push(int value){
        if(head==null){
            createStack(value);
            System.out.println("stack has been created");
            return;
        }
        Node node=new Node();
        node.value=value;
        node.next=head;
        head=node;
        System.out.println("pushed");
    }
    //pop
    public int pop(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        else if(head.next==null){
            int x=head.value;
            head=tail=null;
            return x;
        }else{
            int x=head.value;
            head=head.next;
            return x;
        }
    }
    //peek 
    public int peek(){
        if(head==null){
            return Integer.MIN_VALUE;
        }
        else{
            int x=head.value;
           
            return x;
        }

    }
    //isEmpty
    public boolean isEmpty(){
        return head==null;
    }
    //delete
    public void delete(){
        head=null;
        tail=null;
        System.out.println("deleted");
    }
    
    
}
