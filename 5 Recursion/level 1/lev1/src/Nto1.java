public class Nto1 {
    public static void main(String[] args) {
        //print(5);
        printBoth(5);

    }
    public static void print(int n){
        if(n==0) return;
        System.out.println(n);
        print(n-1);
    }
    public static void printBoth(int n){
        if(n==0) return;
        System.out.println(n);
        printBoth(n-1);
        System.out.println(n);
    }
}
