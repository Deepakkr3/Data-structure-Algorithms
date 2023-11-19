class Main{
    public static void main(String[] args) {
        LinkedList ll=new LinkedList();
        ll.createLinkedList(10);
        ll.insertNode(11,0);
        ll.insertNode(12,0);
        ll.insertNode(13,0);
        ll.insertNode(14,0);
        ll.insertNode(15,0);
        ll.insertNode(20,8);
        ll.insertNode(21,3);
        ll.insertNode(41,2);
        ll.deleteNode(0);
        ll.deleteNode(3);
      ll.traverse();
      
    }
}