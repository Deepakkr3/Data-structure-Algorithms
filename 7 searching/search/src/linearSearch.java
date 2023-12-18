public class linearSearch {
    public static void main(String[] args) {
        int arr[]={1,8,6,3,5,9,4,0,55,66,33};
        System.out.print(linearSearch(arr,0,332));
    }
    public static int linearSearch(int[] arr,int ind,int target){
        if(ind==arr.length){
            return -1;
        }
        if(arr[ind]==target){
            return ind;
        }
        return linearSearch(arr,ind+1,target);
    }
}
