public class Stack {
    int arr[];
    int topOfStack;
    public Stack(int size){
        this.arr = new int[size];
        this.topOfStack =-1;
        System.out.println("stack has been created with size :"+size);
    }
    //is empty 
    public boolean isEmpty(){
        return topOfStack==-1;
    }
    //is full
    public boolean isFull(){
        return topOfStack==arr.length-1;
    }
    //push
    public void push(int value){
        if(isFull()){
            System.out.println("stack is full");
            return;
        }
        else{
            arr[topOfStack+1]=value;
            topOfStack++;
            System.out.println("value has been pushed");
        }
        
    }
    //pop
    public int pop() {
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int val= arr[topOfStack];
         topOfStack--;
         return val;
    }
    //peek
    public int peek() {
        if(isEmpty()){
            return Integer.MIN_VALUE;
        }
        int val= arr[topOfStack];
        
         return val;
    }
    //delete
    public void delete(){
        arr=null;
        topOfStack=-1;
        System.out.println("success! full deleted");
    }
}
