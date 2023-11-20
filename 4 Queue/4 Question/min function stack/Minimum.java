public class Minimum {
    Stack s1=new Stack();
    Stack min=new Stack();
    public void push(int value){
        if(min.head==null){
            min.insertBeg(value);
        }else{
            if(min.head.value>value){
                min.insertBeg(value);
            }
            else{
                min.insertBeg(min.head.value);
            }
        }
        s1.insertBeg(value);

    }
    public int pop(){
        min.deleteBeg();
        int val=s1.deleteBeg();
        return val;

    }
    public int min(){
        return min.peek();
    }


    
}
