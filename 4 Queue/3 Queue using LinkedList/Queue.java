class Queue{
    Node head;
    Node tail;
    public boolean isEmpty() {
        return head==null;
    }
    public void enqueue(int value) {
        if(isEmpty()){
            Node node=new Node();
            node.val=value;
            node.next=null;
            head=tail=node;
            System.out.println("queue has been created");
            return;
        }
        else{
            Node node=new Node();
            node.val=value;
            tail.next=node;
            tail=node;
            System.out.println("enqued successfully");

        }
    }
    public int dequeue() {
        if(isEmpty()){
            System.out.println("first enque fefore dequeue");
            return Integer.MIN_VALUE;

        }
        else{
            int val=head.val;
            head=head.next;
            return val;
        }
    }
    public void delete(){
        tail.next=null;
        tail=head=null;
        System.out.println("delete ");

    }
}