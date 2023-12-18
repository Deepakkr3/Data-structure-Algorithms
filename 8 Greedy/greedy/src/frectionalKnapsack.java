import java.util.Arrays;
import java.util.Comparator;

public class frectionalKnapsack {
    public static void main(String[] args) {
        int val[]={60,100,120};
        int  weight[]={10,20,30};
        System.out.print(maxVal(val, weight,50));

    }
    public static int maxVal(int val[],int weight[],int capacity) {
        double ratio[][]=new double[val.length][2];
        for(int i=0;i<val.length;i++){
            ratio[i][0]=i;
            ratio[i][1]=(double) val[i]/(double)weight[i];

        }
        Arrays.sort(ratio, Comparator.comparingDouble(o->o[1]));
        int maxVal=0;
        for(int i=weight.length-1; i>=0; i--){
            int ind=(int)ratio[i][0];
            if(capacity>=weight[ind]){
                maxVal+=val[ind];
                capacity-=weight[ind];
            }
            else{
                maxVal+=capacity*ratio[i][1];
                capacity=0;
            }
        }
        return maxVal;


    }
}
