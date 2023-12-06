import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        int arr[]={1,5,2,3,9,42,89,2,10,95};
        bucketSort(arr);
        for(int x:arr) {
            System.out.print(x+" ");
        }

    }
    public static void bucketSort(int arr[]){
        //to get number of buckets
        int numberOfBuckets=(int)Math.ceil(Math.sqrt(arr.length));
        ArrayList<Integer> buckets[]=new ArrayList[numberOfBuckets];
        for(int i=0;i<buckets.length;i++){
            buckets[i]=new ArrayList<Integer>();
        }
        int maxValue=Integer.MIN_VALUE;
        //to get max value
        for(int val:arr){
            if(val>maxValue){
                maxValue=val;
            }
        }
        //in which bucket shuld be insert
        for(int val:arr){
            int bucket=(int)Math.ceil((float)(numberOfBuckets*val)/(float) maxValue);
            buckets[bucket-1] .add(val);
        }
        //sort indivisual buckets
        for(ArrayList<Integer> al:buckets){
            Collections.sort(al);
        }
        //make a array
        int ind=0;
        for(ArrayList<Integer> al:buckets){
            for(int val:al){
                arr[ind++]=val;

            }
        }
    }
}
