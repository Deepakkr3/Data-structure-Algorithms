import java.util.Scanner;

public class TreeCreat {
    public static Node create(){
        Node root=null;
        Scanner sc=new Scanner(System.in);
        System.out.print("enter root");
        int data=sc.nextInt();
        if(data==-1){
            return null;
        }
        root=new Node(data);
        System.out.println("enter the left child of"+data);
        root.left=create();
        System.out.println("enter the right child of"+data);
        root.right=create();
        return root;
    }
    public static void main(String[] args) {
        Node head=create();

    }
}
