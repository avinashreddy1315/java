
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;




public class Hash_set {
    public static void main(String[] args) {
        
        //It doesn't store elemt in any sequience order
        Set<Integer> str = new HashSet<>();
        str.add(5);
        str.add(7);
        str.add(10);
        str.add(20);


        /*System.out.println(str); 


        Set<Integer> str = new TreeSet<>();


        str.add(5);
        str.add(2);
        str.add(9);
        

        System.out.println(str); */

        Iterator<Integer> values = str.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }
    }
}
