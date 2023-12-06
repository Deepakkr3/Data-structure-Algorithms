public class Bsearch {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,8,9,11,14,23,30};
        int res=search(arr,12,0,arr.length-1);
        System.out.print(res);

    }
    public static  int search(int arr[],int t,int s,int e){
        if(s>e){
            return -1;
        }
        int m=s+(e-s)/2;
        if(arr[m]==t){
            return m;
        }
        if(arr[m]>t){
            return search(arr,t,s,m-1);
        }
        return search(arr,t,m+1,e);
    }
}
