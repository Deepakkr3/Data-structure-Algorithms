public class countZero {
    public static void main(String[] args) {
        System.out.print(count(1204300120,0));

    }
    public static int count(int n,int z){
        if(n==0) {
            return z;
        }
        int rem=n%10;
        if(rem==0) {
          return  count(n/10,z+1);
        }else{
            return count(n/10,z);
        }


    }
}
