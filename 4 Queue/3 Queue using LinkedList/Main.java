class Main{
    public static void main(String[] args) {
        Queue q=new Queue();
        q.enqueue(10);
        q.enqueue(11);
        q.delete();
        System.out.println(q.dequeue());

    }
}