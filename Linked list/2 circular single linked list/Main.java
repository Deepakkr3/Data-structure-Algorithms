class Main{
    public static void main(String[] args) {
        LinkedList ld=new LinkedList();
        ld.createNode(10);
        ld.insertNode(11, 0);
        ld.insertNode(12, 0);
        ld.insertNode(13, 8);
        ld.insertNode(15, 8);
        ld.insertNode(20, 2);
        
        ld.traverse();
        System.out.println();
        ld.deleteAll();
         ld.traverse();
       
    }
}