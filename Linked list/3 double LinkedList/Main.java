class Main{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.createNode(10);
        ll.insertDll(11,0);
         ll.insertDll(12,10);
          ll.insertDll(13,10);
           ll.insertDll(14,10);
           //ll.insertDll(50, 3);
            ll.insertDll(20, 4);
            ll.delete(4);
            
            
          ll.deleteAll();
        ll.traverse();
        //ll.reverseTraversal();
        //ll.search(21);
        
    }
   
}