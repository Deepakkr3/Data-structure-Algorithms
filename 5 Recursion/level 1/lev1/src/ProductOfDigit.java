public class ProductOfDigit {
    public static void main(String[] args) {
        System.out.print(prod(1234));
    }
    public static int prod(int n){
        if(n%10==n){
            return  n;
        }
        return (n%10)*prod(n/10);
    }
}
