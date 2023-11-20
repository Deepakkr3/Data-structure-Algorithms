/**
 * LinkedList
 */
public class LinkedList {
    Node head;
    Node tail;
    int size;
    //create ll
    public Node createNode(int value){
        Node node = new Node();
        node.value = value;
        node.next=null;
        node.previous = null;
        head=node;
        tail=node;
        size=1;
        return head;
    }
    //insert method
    public void insertDll(int value,int location){
         Node node =new Node();
        node.value=value;
        if(head==null)
        {
            createNode(value);
            return;
        }
       
        else if(location==0){
            node.next=head;
            node.previous=null;
            head.previous=node;
            head=node;
            size++;
        }
        else if(location>=size){
            tail.next=node;
            node.previous=tail;
            node.next=null;
            tail=node;
            size++;
        }
        else{
            Node temp=head;
            for(int i=0;i<location-2;i++){
                temp=temp.next;
            }
            Node currNext=temp.next;
            temp.next=node;
            node.previous=temp;
            currNext.previous=node;
            node.next=currNext;
            size++;
        }


    }
    //traversing
    public void traverse(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.next;

        }
        System.out.println();
    }
    //reverse traversal 
    public void reverseTraversal(){
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.value+" ");
            temp=temp.previous;
        }
        System.out.println();
    }
     //search a value in linked list
     public void search(int value){
        Node temp=head;
        while(temp!=null){
            if(temp.value==value){
                System.out.println("found ");
                return;
            }
            temp=temp.next;

        }
        System.out.println("not found");
    }
    //delete node
    public void delete(int location){
        if(head==null){
            System.out.println("linked list not exist add first");
            return;
        }
        if(location==0){
            if(size==1){
                head=tail=null;
                size--;
                return;
            }
            else{
                 Node temp=head.next;
            head=head.next;
            temp.previous=null;
            size--;

            }
           
            

        }
        else if(location>=size){
             if(size==1){
                head=tail=null;
                size--;
                return;
            }else{
           Node temp=tail.previous;
           temp.next=null;
           tail.previous=temp.previous;
           tail=temp;
           size--;
            }

        }
        else{
            Node temp=head;
            for(int i=0;i<location-2;i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
            temp.previous=temp;
            size--;
        }
    }
    //delete all linked list
    public void deleteAll() {
        Node temp=head;
        for(int i=0;i<size;i++){
            temp.previous=null;
            temp=temp.next;
        }
        head=tail=null;
        System.out.println("ll has been deleted");
    }

    
}