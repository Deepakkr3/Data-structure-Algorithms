public class sumN {
    public static void main(String[] args) {
        System.out.print(summ(4));
    }
    public static int summ(int n){
        if(n==0){
            return 0;
        }
        return n+summ(n-1);
    }
}
