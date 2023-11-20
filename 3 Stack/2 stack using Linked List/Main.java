public class Main {
   public static void main(String[] args) {
    Stack st=new Stack();
    st.push(10);
    st.push(2);
    System.out.println(st.pop());
     System.out.println(st.peek());
     st.delete();
      System.out.println(st.peek());
   } 
}
