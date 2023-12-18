import java.util.Arrays;

public class IndianCoins {
    public static void main(String[] args) {
        int arr[]={1,2,5,10,20,50,100,500,2000};
        int val=610;
        System.out.println(minCoin(arr, val));

    }
    public static int minCoin(int[] arr,int val) {
        Arrays.sort(arr);
        int min=0;
        for(int i=arr.length-1;i>=0;i--){
            while(val>=arr[i]){
                min++;
                val-=arr[i];
                System.out.println(val+" "+arr[i]);

            }
        }
        return min;

    }
}
