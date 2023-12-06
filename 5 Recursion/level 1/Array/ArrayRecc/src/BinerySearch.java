public class BinerySearch {
    public static void main(String[] args) {
        int arr[]={1,2,5,6,7,9,12,16,17,55,59};
        System.out.println(search(arr,55,0,arr.length-1));

    }
    public static  int search(int arr[],int target,int s,int e){
        if(s>e){
            return -1;
        }
        int mid=s+(e-s)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[mid]>target){
          return  search(arr,target,s,mid-1);
        }
        else{
            return search(arr,target,mid+1,e);
        }

    }
}
