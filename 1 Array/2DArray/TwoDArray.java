public class TwoDArray {
    int arr[][]=null;
    TwoDArray(int row,int col){
        arr=new int[row][col];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                arr[i][j] =Integer.MIN_VALUE;
            }
        }

    }
    public void insetMethod(int row,int col,int element){
        try{
            if(arr[row][col]==Integer.MIN_VALUE){
                arr[row][col] = element;
                System.out.println("sucsessfull inserted element");
            }
            else{
                System.out.println("value already ocopied");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
    //accesing element
    public void accesing(int row,int col){
        try{
             System.err.println(arr[row][col]);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
    public void treverseArray(){
        for(int i=0; i<arr.length;i++){
             for(int j=0; j<arr[i].length;j++){
                System.out.print(arr[i][j]+" ");
             }
             System.out.println();
        }
    }
    //serch 
    public void rerchElement(int value){
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==value){
                    System.out.println(i+""+j);
                    return;
                }
            }
        }
        System.out.println("not found");
    }
    //delete
    public void deleteElement(int row,int col){
        try{if(arr[row][col]!=Integer.MIN_VALUE){
            System.out.println("sucessfully deleted"+arr[row][col]);
            arr[row][col] = Integer.MIN_VALUE;
          
        }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }

    }
}
