
public class Main {
    public static  void num1(int n){
        System.out.println(n);
        num2(2);
    } public static  void num2(int n){
        System.out.println(n);
        num3(3);
    } public static  void num3(int n){
        System.out.println(n);
        num4(4);
    } public static  void num4(int n){
        System.out.println(n);
        num5(5);
    } public static  void num5(int n){
        System.out.println(n);
        num6(6);
    } public static  void num6(int n){
        System.out.println(n);
    }
    public static void main(String[] args) {
        //num1(1);
      //message1();
        num(1);
    }
    static void num(int n){
        if(n >5)
            return;
       System.out.println(n);
       num(n+1);
    }
    public static void message1(){
        System.out.println("hellow world");

        message2();
        System.out.println("hellow world main");
    }public static void message2(){
        System.out.println("hellow world");
        message3();
    }public static void message3(){
        System.out.println("hellow world");
        message4();
    }public static void message4(){
        System.out.println("hellow world");
        message5();
    }public static void message5(){
        System.out.println("hellow world");
        message6();
    }public static void message6(){
        System.out.println("hellow world");
    }
}