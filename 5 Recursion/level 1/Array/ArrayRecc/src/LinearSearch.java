import java.util.ArrayList;
import java.util.List;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,5,3,9,4,2,6,10,24,11,6};
        System.out.println(search(arr,0,111));
        System.out.println(search3(arr,0,6));

    }
    public static int search(int arr[],int i,int t){
        if(i==arr.length){
            return -1;
        }
        if (arr[i] == t) {

            return i;
        }
        return search(arr,i+1,t);
    }
    public static List<Integer> search2(int arr[],int i,int t, ArrayList<Integer> al){
        if(i==arr.length){
            return al;
        }
        if(arr[i]==t){
            al.add(i);
        }
        return search2(arr,i+1,t,al);

    }
    public static List<Integer> search3(int arr[],int i,int t){
        ArrayList<Integer> al=new ArrayList<Integer>();
        if(i==arr.length){
            return al;
        }
        if(arr[i]==t){
            al.add(i);
        }
        List<Integer> res= search3(arr,i+1,t);
        al.addAll(res);
        return al;

    }
}
