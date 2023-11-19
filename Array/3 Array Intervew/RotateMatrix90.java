public class RotateMatrix90 {
    public static void main(String[] args) {
        int mat[][]={{1,2,3},{4,5,6},{7,8,9}};
        int arr[][]=new int[mat.length][mat[0].length];
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++){
                arr[j][mat[i].length-1-i]=mat[i][j];
            }
        }
        for(int i=0; i<mat.length; i++)
        {
            for(int j=0; j<mat[i].length; j++){
              System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        
    }
}
