public class Permutation {
    public static void main(String[] args) {
        int arr1[]={10,2,4,8,90,6,20,7};
        int arr2[]={10,2,4,8,90,6,20,7};
        System.out.println(isPermutation(arr1, arr2));
        
    }
    public static boolean isPermutation(int arr1[],int arr2[]) {
        if(arr1.length != arr2.length){
            return false;
        }
        int sum1=0;
        int sum2=0;
        int prod1=1;
        int prod2=1;
        for(int i=0;i<arr1.length;i++){
            sum1+=arr1[i];
            prod1*=arr1[i];
        }
        for(int i=0;i<arr2.length;i++){
            sum2+=arr2[i];
            prod2*=arr2[i];
        }
        if(sum1==sum2 && prod1==prod2){
            return true;
        }
        return false;
        
    }
    
}
