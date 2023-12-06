public class SelectionSort {
    public static void main(String[] args) {
        int arr[]={1,2,5,3,9,6,7,5,21,66,8,22};
        selectionSort(arr);
        for(int x:arr){
            System.out.print(x+" ");
        }
    }
    public static void selectionSort(int[] arr){
        for(int i=0;i<arr.length;i++){
            int inds=i;

            for(int j=inds;j<arr.length;j++){
                if(arr[inds]>arr[j]){
                    inds=j;
                }

            }
            if(inds!=i){
            int temp=arr[inds];
            arr[inds]=arr[i];
            arr[i]=temp;}

        }
    }
}
