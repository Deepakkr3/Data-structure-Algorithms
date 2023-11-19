public class LinkedList {
    Node head;
    Node tail;
    int size;
    //create linked list
    public Node createLinkedList(int value){
        head=new Node();
        Node node=new Node();
        node.value=value;
        node.next=null;
        
        tail=node;
        head=node;
        size=1;
        return head;
        
    }
    //insert last
    public void insertLast(int nodeValue){
        if(head==null){
            createLinkedList(nodeValue);
            return;
        }
        Node node=new Node();
        node.value=nodeValue;
        node.next=null;
        tail.next=node;
        tail=node;
        size++;
    }
    //traverse
    public void traverse(){
        Node temp=head;

        do{
            System.out.print(temp.value+" ");
            temp=temp.next;
        }while(temp!=null);
        System.out.println();
    }
    

}
