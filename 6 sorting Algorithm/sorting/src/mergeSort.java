public class mergeSort {
    public static void main(String[] args) {
        int arr[]={1,8,2,6,9,10,3};
        mergeSort(arr,0,arr.length-1);
        for(int x:arr) {
            System.out.print(x+" ");
        }


    }
    public static void merge(int arr[],int start,int mid,int end){
        int leftArr[]=new int[mid-start+1];
        int rightArr[]=new int[end-mid];
        for(int i=0;i<leftArr.length;i++){
            leftArr[i]=arr[i+start];
        }
        for(int i=0;i<rightArr.length;i++){
            rightArr[i]=arr[i+mid+1];
        }
        int i=0;
        int j=0;
        int k=start;
        while(i<leftArr.length && j<rightArr.length){
            if(leftArr[i]>rightArr[j]){
                arr[k++]=rightArr[j++];
            }
            else{
                arr[k++]=leftArr[i++];
            }
        }
        while(i<leftArr.length){
            arr[k++]=leftArr[i++];
        }
        while(j<rightArr.length){
            arr[k++]=rightArr[j++];
        }
    }
    public static void mergeSort(int arr[],int s,int e){
        if(s<e){

        int mid=s+(e-s)/2;
        mergeSort(arr,s,mid);
        mergeSort(arr,mid+1,e);
        merge(arr,s,mid,e);}

    }
}
