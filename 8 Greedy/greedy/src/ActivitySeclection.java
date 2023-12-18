import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ActivitySeclection {
    public static void main(String[] args) {
        int startTime[]={1,3,0,5,8,5};
        int endTime[]={2,4,6,7,9,9};
        System.out.println(maxAct(startTime, endTime));
        int count=1;
        int endTimeOfLast=endTime[0];
        for(int i=0;i<startTime.length;i++){
            if(endTimeOfLast<=startTime[i]){
                count++;
                endTimeOfLast=endTime[i];
            }
            

        }
        System.out.print(count);
    }
    //if ending time is not sorted
    public static  int  maxAct(int arrStart[],int arrEnd[]){
        int arr[][] = new int[arrStart.length][3];
        for(int i=0;i<arrStart.length;i++){
            arr[i][0]=i;
            arr[i][1]=arrStart[i];
            arr[i][2]=arrEnd[i];
        }
        //sorting based on end time
        Arrays.sort(arr, Comparator.comparingDouble(o->o[2]));
        int count=1;
        int endLast=arr[0][2];
        for(int i=1;i<arrStart.length;i++){
            if(arr[i][1]>=endLast){
                count++;
                endLast=arr[i][2];
            }
        }
        return count;

    }
    
    
}
