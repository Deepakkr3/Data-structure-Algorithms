class Main{
    public static void main(String[] args) {
        Stack st=new Stack(4);
        st.push(10);
        st.push(12);
        st.push(13);
        st.push(14);
       
        System.out.println(st.pop());
         System.out.println(st.pop());
          System.out.println(st.pop());
        
         System.out.println(st.peek());
          System.out.println(st.pop());
          st.delete();
          System.out.println(st.pop());
      
        
    }
}