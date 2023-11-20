public class SinglyLL {
   public Node head;
    public Node tail;
   public int size;
   public Node insrtNode(int nodeValue){
    head=new Node();
    Node node=new Node();
    node.value=nodeValue;
    node.next=null;
    head=node;
    tail=node;
    size=1;
    return head;
   }
   //insert method singly linked list
   public void insert(int nodeValue,int location){
    Node node=new Node();
    node.value=nodeValue;
    if(head==null){
        insrtNode(nodeValue);
        return;
    }
    else if(location==0){
        node.next=head;
        head=node;
    }
    else if(location>=size){
        node.next=null;
        tail.next=node;
        tail=node;
    }
    else{
        Node temp=head;
        int index=0;
        while(index<location-1){
            temp=temp.next;
            index++;
        }
        Node nextToNext=temp.next;
        temp.next=node;
        node.next=nextToNext.next;
    }
    size++;


   }
   //traverse ll
   public void traverse(){
    if(head==null){
        System.out.println("first fill");
    }
    Node temp=head;
    while (temp!=null) {
        System.out.print(temp.value+"  ");
        temp=temp.next;

        
    }
   }
   //search node 
   public boolean search(int nodeValue){
    if(head!=null){
        Node temp=head;
        for(int i=0;i<size;i++){
            if(temp.value==nodeValue){
                return true;
            }
            temp=temp.next;
    }
   }
   return false;

    
}
//delete node  in ll
public void deleteNode(int location){
    if(head==null){
        System.out.println("your linked list is empty");
        return;
    }
    else if(location==0){
        head=head.next;
        size--;
        if(size==0){
            tail=null;
        }
    }
    else if(location>=size){
        Node temp=head;
        for(int i=0;i<size-2;i++){
            temp=temp.next;

        }
        if(temp==head){
            tail=head=null;
            size--;
            return;
        }
        temp.next=null;
        tail=temp;
        size--;

    }
    else{
        Node temp=head;
        for(int i=0;i<location-1;i++){
            temp=temp.next;
        }
        temp.next=temp.next.next;
        size--;
    }

}
//delete entire linked list
  public void deleteLL(){
    head=tail=null;
    System.out.println("deleted ");
  }
}
