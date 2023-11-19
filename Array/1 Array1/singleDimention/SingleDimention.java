 package singleDimention;
 
 class SingleDimention{
    int arr[]=null;
    public SingleDimention(int size){
        arr=new int[size];
        for(int i=0;i<size;i++){
            arr[i]=Integer.MIN_VALUE;
        }

    }
    public void insert(int index,int value){
        try{
            if(arr[index]==Integer.MIN_VALUE){
                arr[index]=value;
                System.out.println("success fully inserted");
            }
            else{
                System.out.println("value already exists");
            }

        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println(e.getMessage());
        }
    }
        //array traversal
        public void traverseArray(){
            try{
                for(int i=0; i<arr.length;i++){
                    System.out.print(arr[i]+" ");

            }
            System.out.println();
            }catch(IndexOutOfBoundsException e){
                System.out.println(e.getMessage());

            }
            

        }
        //serch element in arry
        public int serchElement(int element){
            for(int i=0;i<element;i++){
                if(arr[i]==element){
                    return i;
                }
            }
            return -1;

        }
        //delete
        public void deleteElement(int index){
            try{
                arr[index] =Integer.MIN_VALUE;
                System.out.println("value has been deleted");

            }catch(ArrayIndexOutOfBoundsException e)
            {
                System.out.println(e.getMessage());
            }
        } 
    



}