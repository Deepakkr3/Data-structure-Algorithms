public class SearchValue {
    public static void main(String[] args) {
        int arr[]={1,20,7,15,2,8,16,3};
        search(arr, 8);
        
    }
    public static void search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println(i+" fount at the index ");
                return;
            }
            
        }
        throw new IllegalArgumentException("Invalid target");

    }
    
}
