import java.util.Arrays;

public class MinimumAbsDiffrence {
    public static void main(String[] args) {
        int A[]={1,2,3};
        int B[]={2,1,3};
        System.out.println(minAbsDifference(A, B));
    }
    public static int  minAbsDifference(int[] A, int[] B){
        Arrays.sort(A);
        Arrays.sort(B);
        int minDifference=0;
        for(int i = 0; i < A.length; i++){
            minDifference+=Math.abs(A[i]-B[i]);
        }
        return minDifference;
    }
}
