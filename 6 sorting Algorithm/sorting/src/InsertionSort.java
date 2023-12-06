public class InsertionSort {
    public static void main(String[] args) {
        int arr[]={1,5,2,7,3,9,12,11,23,55,24,60,18};
        insertionSort(arr);
        for(int x:arr) {
            System.out.print(x+" ");
        }
    }
    public static void insertionSort(int arr[]){
        for(int i=1;i<arr.length;i++){
            int j=i;
            int temp=arr[i];
            while(j>0&& arr[j-1]>temp){
                arr[j]=arr[j-1];
                j--;
            }
            arr[j]=temp;
        }
    }
}
