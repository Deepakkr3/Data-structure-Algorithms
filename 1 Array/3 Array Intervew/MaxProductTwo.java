public class MaxProductTwo {
    public static void main(String[] args) {
        int arr[]={10,2,4,8,90,6,20,7};
        System.out.println(getProduct(arr));
        
    }
    //for posatve integer
    public static String getProduct(int arr[]){
        int prod=0;
        String res="";
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length;j++) {
                if(arr[j]*arr[i]>prod){
                    prod=arr[i]*arr[j];
                    res=Integer.toString(arr[i])+" "+Integer.toString(arr[j]);

                }

            }
        }
        return res;
    }
}
