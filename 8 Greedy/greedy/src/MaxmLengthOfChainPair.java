import java.util.Arrays;
import java.util.Comparator;

public class MaxmLengthOfChainPair {
    public static void main(String[] args) {
        int arr[][]={{5,24},{39,60},{5,28},{27,40},{50,90}};
        System.out.println(maxLength(arr));

    }
    public static int maxLength(int[][] arr) {
        Arrays.sort(arr, Comparator.comparingDouble(o->o[1]));
        int max=1;
        int lastEnd=arr[0][1];
        for(int i=1;i<arr.length;i++) {
            if(lastEnd<arr[i][0]){
                max++;
                lastEnd=arr[i][1];
            }
        }
        return max;

    }
}
