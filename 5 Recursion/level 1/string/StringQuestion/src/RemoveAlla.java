public class RemoveAlla {
    public static void main(String[] args) {
        String str="deepakanil";
        System.out.println(removeA(str,0,""));
        System.out.println(removeA1(str,0));

    }
    public static String removeA(String str,int ind,String res){
        if(ind==str.length()){
            return res;
        }
        char ch=str.charAt(ind);
        if(ch!='a'){
            res+=ch;
        }
       return removeA(str,ind+1,res);
    }
   public static String removeA1(String str,int ind){
        if(str.length()==ind){
            return "";
        }
        String res="";
        if(str.charAt(ind)!='a'){
            res+=str.charAt(ind);
        }
        res+=removeA1(str,ind+1);
        return res;

   }
}
