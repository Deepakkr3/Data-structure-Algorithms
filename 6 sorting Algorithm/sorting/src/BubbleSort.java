public class BubbleSort {
    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,5,10,8,12,30,22};
        bubleSort(arr);
        for(int x:arr) {
            System.out.print(x+" ");
        }

    }
    public static void bubleSort(int arr[]){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if(arr[j]>=arr[j+1]){
                    int x=arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1]=x;
                }
            }
        }
    }
}
