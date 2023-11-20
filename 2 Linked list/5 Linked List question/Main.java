class Main{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.createLinkedList(7);
        ll.insertLast(1);
        ll.insertLast(6);
        
        ll.traverse();
        LinkedList ll2=new LinkedList();
        ll2.createLinkedList(5);
        ll2.insertLast(9);
        ll2.insertLast(2);
      
        ll2.traverse();
        Question q=new Question();
        LinkedList res=q.sumList(ll,ll2);
        res.traverse();

        
   
  
     
       
       

    }
}