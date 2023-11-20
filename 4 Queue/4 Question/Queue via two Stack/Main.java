import java.util.*;
class Main{
   static Stack<Integer> s1=new Stack<Integer>();
   static  Stack<Integer> s2=new Stack<Integer>();
    public  static boolean isEmpty() {
        return s1.size() == 0;
    }
    public static void add(int v){
        
            while(!s1.isEmpty()){
                s2.push(s1.pop());

        }
        s1.push(v);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
        
    }
    public static int get(){
        if(s1.isEmpty()){
            return -1;
        }
        else{
            return s1.pop();
        }
    }


    public static void main(String[] args) {
        add(10);
        add(11);
        add(12);
        System.out.print(get());
        
    }
}