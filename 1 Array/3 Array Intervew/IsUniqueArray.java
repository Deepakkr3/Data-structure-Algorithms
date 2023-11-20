public class IsUniqueArray {
    public static void main(String[] args) {
        int arr[]={10,2,4,8,7,90,6,20,7};
        System.out.println(isUniqueArr(arr));
        
    }
    public static Boolean isUniqueArr(int[] arr) {
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i]==arr[j]){
                    return false;
                }

            }
        }
        return true;
    }
    
}
