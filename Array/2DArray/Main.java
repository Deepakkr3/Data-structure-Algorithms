
import java.util.*;
public class Main {
    public static void main(String[] args) {
      TwoDArray array=new TwoDArray(2,2);
      array.insetMethod(0,0,2);
        array.insetMethod(0,1,3);
          array.insetMethod(1,0,4);
           // array.insetMethod(0,0,2);
           System.out.println(Arrays.deepToString(array.arr));
           array.treverseArray();
           array.deleteElement(0, 0);
            array.treverseArray();
           

       
    }
}
