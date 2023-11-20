public class Queue {
    int arr[];
    int topOfQueue;
    int begOfQueue;
    int size;
    public Queue(int size) {
        this.arr = new int[size];
        this.topOfQueue =-1;
        this.size = size;
        this.begOfQueue =-1;
        System.out.println("created queue of size  "+size);
    }
    public boolean isEmpty() {
        return begOfQueue==-1;
    }
    public boolean isFull(){
        if(topOfQueue+1==begOfQueue){
            return true;
        }else if(begOfQueue==0 && topOfQueue+1==size){
            return true;
        }
        return false;
    }
    public void enQueue(int value){
        if(isFull()){
            System.out.println("queue is full");
            return;
        }else if(isEmpty()){
            begOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("successfull enqueue");

        }else{
            if(topOfQueue+1==size){
                topOfQueue=0;
            }else{
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("successfull enqueue");
        }
    }
    public int deQueue(){
        if(isEmpty()){
            System.out.println("empty queue");
            return Integer.MIN_VALUE;
        }else{
            int val=arr[begOfQueue];
            arr[begOfQueue] =Integer.MIN_VALUE;
            if(begOfQueue==topOfQueue){
                begOfQueue=topOfQueue=-1;
            }else{
                begOfQueue++;
            }
            return val;

        }
    }
    public void delete(){
        arr=null;
        topOfQueue=begOfQueue=-1;
    }
    
}
