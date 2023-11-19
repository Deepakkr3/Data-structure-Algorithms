public class TwoSum {
    public static void main(String[] args) {
        int arr[]={2,6,3,9,11};
        pairSum(arr, 11);

        
    }
    public static void pairSum(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+","+arr[j]);
                    return ;
                }

        }
    }
    throw new IllegalArgumentException("illigle target not found");
    
}
}
