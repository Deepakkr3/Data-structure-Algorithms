public class LinkedList {
    Node head;
    Node tail;
    int size;
    public Node createLinkedList(int value){
        head=new Node();
        Node node=new Node();
        node.value=value;
        node.next=node;
        node.previus=node;
        head=tail=node;
        size=1;
        return head;
    }
    //inserting a node
    public void insertNode(int value,int location){
        if(head==null){
            createLinkedList(value);
            return;
        }
        Node node =new Node();
        node.value=value;
        if(location==0){
            node.next=head;
             head.previus=node;
             node.previus=tail;
             tail.next=node;
             head=node;
             size++;



        }
        else if(location>=size){
            Node tailNext=tail.next;
            tail.next=node;
            node.previus=tail;
            node.next=tailNext;
            head.previus=node;
            tail=node;
            size++;
        }
        else{
            Node temp=head;
            int index=0;
            while(index<location-2){
                temp=temp.next;
                index++;
            }
            Node tempToNext=temp.next;
            temp.next=node;
            node.previus=temp;
            node.next=tempToNext;
            tempToNext.previus=node;
            size++;
        }
    }
    //traversal
    public void traverse(){
        Node temp=head;
        do{
           System.out.print(temp.value+" "); 
            temp=temp.next;

        }while(temp!=head);
        System.out.println();
    }
    //reverse traversal
    public void reverseTraversal(){
        Node temp=tail;
        do{
            System.out.print(temp.value+" ");
            temp=temp.previus;

        }while(temp!=tail);
        System.out.println();
    }
    //search 
    public void serchValue(int value){
        Node temp=head;
        do{
            if(temp.value==value){
                System.out.println("value has been found");
                return;
            }
            temp=temp.next;

        }while(temp!=head);
        System.out.println("not exists");
    }
    //deletion 
    public void deleteNode(int location){
        if(head==null){
            System.out.print("add first before deletion");
            return;
        }
        else if(location==0){
            if(size==1){
                head.next=null;
                head.previus=null;
                head=null;
                tail=null;
                size--;

            }else{
                head=head.next;
                head.previus=tail;
                tail.next=head;
                size--;
            }
        }else if(location>=size){
            if(size==1){
                head.next=null;
                head.previus=null;
                head=null;
                tail=null;
                size--;
            }else{
                tail=tail.previus;
                head.previus=tail;
                tail.next=head; 
                size--;
            }

        }else{
            Node temp=head;
            int ind=0;
            while(ind<location-2){
                temp=temp.next;
                ind++;
            }
            Node tempNext=temp.next;
            temp.next=temp.next.next;
            temp.next.previus=temp;
            size--;
        }
    }
    //delete All
    public void deleteAll(){
        head.previus=null;
        tail.next=null;
        Node temp=head;
        while(temp!=null){
            temp.previus=null;
            temp=temp.next;
        }
       
        head=tail=null;
        System.out.println("sucsessfully deleted");
    }
    
}
