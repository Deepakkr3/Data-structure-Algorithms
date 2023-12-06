public class BinerySearchCyclecArray {
    public static void main(String[] args) {
        int arr[]={5,6,7,9,10,1,2,3,4};
        System.out.println(bsearch(arr,2,0,arr.length-1));
    }
    public static int bsearch(int arr[],int target,int start,int end){
        if(start>end){
            return -1;
        }
        int mid=start+(end-start)/2;
        if(arr[mid]==target){
            return mid;
        }
        if(arr[start]<=arr[mid]){
            if(target>=arr[start] && target<=arr[mid]){
                return bsearch(arr,target,start,mid-1);
            }
            else{
                return bsearch(arr,target,mid+1,end);
            }
        }
        if(target>=arr[mid] && target<=arr[end]){
            return bsearch(arr,target,mid+1,end);
        }
        else{
            return bsearch(arr,target,start,mid-1);
        }
    }
}
