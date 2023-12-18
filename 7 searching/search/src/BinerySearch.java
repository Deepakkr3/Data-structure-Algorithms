public class BinerySearch {
    public static int Bsearch(int arr[],int target){
        int s=0;
        int e=arr.length-1;
        int mid=s+(e-s)/2;
        while(target!=arr[mid] && s<e){
            if(arr[mid]>target){
                e=mid-1;
            }
            else{
                s=mid+1;
            }
            mid=s+(e-s)/2;
        }
        if(arr[mid]==target){
            return mid;
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,6,12,10,25};
        System.out.println(bSearch(arr,0,arr.length-1,24));
        System.out.println(Bsearch(arr,24));

    }
    public static int bSearch(int arr[],int s,int e,int target){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
            return bSearch(arr,s,mid-1,target);
        }
        else{
            return bSearch(arr,mid+1,e,target);
        }
    }
}
