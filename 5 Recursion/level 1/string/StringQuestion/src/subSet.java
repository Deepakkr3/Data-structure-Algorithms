import java.util.ArrayList;

public class subSet {
    public static void main(String[] args) {
        ArrayList<Integer> al=new ArrayList<Integer>();
        int arr[]={1,2,3};
        subSet(arr,0,al);

    }
    public static void subSet(int arr[],int i, ArrayList<Integer> al){
        if(i==arr.length){
            System.out.println(al);
            return;
        }
        int x=arr[i];
        subSet(arr,i+1,al);
        al.add(x);
        subSet(arr,i+1,al);

    }

}
