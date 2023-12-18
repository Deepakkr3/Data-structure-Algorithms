import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class JobSequencingProblem {
static class Job{
    int profit;
    int dedline;
    int id;
    public Job(int id, int dedline,int profit){
        this.profit = profit;
        this.dedline = dedline;
        this.id =id;
    }
}

    public static void main(String[] args) {
        int [][]arr={{4,20},{1,10},{1,40},{1,30}};
        ArrayList<Job> myjob=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            myjob.add(new Job(i,arr[i][0],arr[i][1]));
        }
        Collections.sort(myjob,(a, b) -> b.profit-a.profit);//desc
        ArrayList<Integer> al=new ArrayList<Integer>();
        int time=0;
        for(int i=0;i<myjob.size();i++){
            Job job=myjob.get(i);
            if(time<job.dedline){
                al.add(job.id);
                time++;
            }
        }
        for(int x:al){
            System.out.println(x);
        }

    }
}
