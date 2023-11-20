public class LinkedList {
    Node head;
    Node tail;
    int size;
    public Node createNode(int value){
        Node node=new Node();
        node.value=value;
        
        node.next=node;
        head=node;
        tail=node;
        size=1;
        return head;
      
    }
    //insertion 
    public void insertNode(int value,int location){
        Node node=new Node();
        node.value=value;
        if(head==null){
            createNode(value);
            return;
        }
        else if(location==0){
            node.next=head;
            head=node;
            tail.next=node;
        }
        else if(location>=size){
            tail.next=node;
            tail=node;
            tail.next=head;
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
            node.next=nextToNext;
        }
        size++;
    }
    //traverse 
    public void traverse(){
        if(head==null){
            System.out.print("add first");
            return;
        }
        Node temp=head;
        do{System.out.print(temp.value+" ");
           temp=temp.next;

        }while (temp!=head); 
            
        }
        //serch given node
        public void serchNode(int value){
            Node temp=head;
            do{
                if(temp.value==value){
                    System.out.print("gut it");
                    return;
                }
                temp=temp.next;

            }while(temp!=head);
            System.out.print("not found");
            
        }
        //delete node
        public void deleteNode(int location){
            if(head==null){
                System.out.println("linkedList not exists");
                return;
            }
            else if(location==0){
                head=head.next;
                tail.next=head;
                size--;
                if(size==0){
                    tail.next=null;
                    head.next=null;
                    head=null;
                }
            }
            else if(location>=size){
                Node temp=head;
                for(int i=0;i<size-2;i++){
                    temp=temp.next;

                }
                if(temp==head){
                    head=tail=null;
                    head.next=null;
                    size--;
                    return;
                }
                temp.next=head;
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
        //delete all
        public void deleteAll(){
            Node temp=head;
            head=tail=tail.next=null;
            size=0;
        }
    }
    

