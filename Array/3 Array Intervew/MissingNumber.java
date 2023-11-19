class MissingNumber{
    public static void main(String[] args){
        System.out.println("hello world");
        int arr[]={1,2,9,4,5,6,7,8,10};
        missing(arr);

    }
    public static void missing(int []arr){
        int sum1=0;
        int sum2=0;
        for(int x:arr){
            sum1+=x;
        }
        sum2=(10*(10+1))/2;
        System.out.print(sum2-sum1+" is the missing number");
    }
}