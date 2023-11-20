public class Queue {
    int arr[];
    int topOfQueue ;
    int begningOfQueue;
    public Queue(int size) {
        this.arr = new int[size];
        this.topOfQueue =-1;
        this.begningOfQueue=-1;
        System.out.println("queue is created "+size);
    }
    public boolean isEmpty() {
        return begningOfQueue==-1||begningOfQueue==arr.length;
    }
    public boolean isFull() {
        return topOfQueue==arr.length-1;
        
    }
    public void enQueue(int value){
        if(isFull()){
            System.out.println("Queue is full");
            return;

        }
        else if(isEmpty()){
            begningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Queue added");
        }else{
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Queue added");
        }
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("Queue empty");
            return Integer.MIN_VALUE;
        }
        else {
            int value=arr[begningOfQueue];
            begningOfQueue++;
            if(begningOfQueue>topOfQueue){
                begningOfQueue=topOfQueue=-1;
            }
            return value;
        }
    }
    public int peek(){
        if(isEmpty()){
            return Integer.MIN_VALUE;


        }
        return arr[begningOfQueue];
    }
    public void delete(){
        arr=null;
        begningOfQueue=topOfQueue=-1;
        System.out.println("que is deleted");
    }

    
}
