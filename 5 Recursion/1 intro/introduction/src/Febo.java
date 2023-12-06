public class Febo {
    public static void main(String[] args) {
        int r=febonacie(5);
        System.out.print(r);
    }
    public static int febonacie (int n){
        if(n==0 ||n==1){
            return n;
        }
      int x=  febonacie(n-1)+febonacie(n-2);
        return x;
    }
}
