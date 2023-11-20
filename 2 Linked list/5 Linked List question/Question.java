import java.util.*;
public class Question {
    
    
    // 1>delete dublicate from unsorted linked list

    void delete(Node head){
        HashSet<Integer> set = new HashSet<Integer>();
        Node curr=head;
        Node prev=null;
       while(curr!=null){
        int val=curr.value;
        if(set.contains(val)){
            
            prev.next=curr.next;

        }else{
            set.add(val);
            prev=curr;
        }
        curr=curr.next;
      
        
       }

    }
    // 2> find n'th from last
    public Node getLast(Node head,int n){
        Node p1=head;
        Node p2=head;
        for(int i=0;i<n;i++){
            if(p2==null) return null;
            p2=p2.next;
        }
        while(p2!=null){
            p2=p2.next;
            p1=p1.next;
        }
        return p1;
    }
    //3> sum list
    LinkedList sumList(LinkedList l1,LinkedList l2) {
        Node h1=l1.head;
        Node h2=l2.head;
        LinkedList result=new LinkedList();
        int carry=0;
        while(h1!=null||h2!=null){
            int res=carry;
            if(h1!=null){
                res+=h1.value;
                h1=h1.next;

            }if(h2!=null){
                res+=h2.value;
                h2=h2.next;

            }
            result.insertLast(res%10);
            carry=res/10;

        }
      
        return result;
    }
    
}
