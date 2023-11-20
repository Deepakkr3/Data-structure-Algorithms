
public class Main {

    public static void main(String[] args) {
        SinglyLL sll=new SinglyLL();
        sll.insrtNode(5);
       // System.out.println(sll.head.value);
        sll.insert(10,0);
       // System.out.println(sll.head.value);
        sll.insert(12,5);
        sll.insert(15,7);
        sll.insert(16,8);
        sll.insert(18,0);
         sll.insert(20,10);
          sll.insert(28,12);

        // System.out.println(sll.tail.value);
        sll.traverse();
        System.out.println();
        //System.out.println(sll.search(8));
        // sll.deleteLL();
        // sll.traverse();
        
    }
}