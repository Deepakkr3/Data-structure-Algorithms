

class Main{
    public static void main(String[] args) {
        Queue qu= new Queue(3);
        qu.enQueue(1);
        qu.enQueue(2);
        qu.enQueue(3);
        qu.delete();
       System.out.print(qu.deQueue());

        
    }

}