public class SubSeq {
    public static void main(String[] args) {
        subSeq("abc","");
    }
    public static void subSeq(String p,String q){
        if(p.isEmpty()){
            System.out.println(q);
            return;
        }
        char c=p.charAt(0);
        subSeq(p.substring(1),q);
        subSeq(p.substring(1),q+c);

    }
}
