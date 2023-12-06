public class ReverseNumber {
    public static void main(String[] args) {
        System.out.print(reverse(12345,0));
    }
    public static  int reverse(int n,int r){
        if(n==0){
            return r;
        }
        int rem=n%10;
        int newn=n/10;
        r=r*10+rem;
       return  reverse(newn,r);
    }
}
