

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Sort_comparator {
    public static void main(String[] args) {

        Comparator<String> com = new Comparator<String>() {
            public int compare(String i, String j){
                if(i.length() < j.length()){
                    return 1;
                }else{
                    return -1;
                }
            }
        };

        List<String> ls = new ArrayList<>();


        ls.add("Avinash");
        ls.add("Tanuja");
        ls.add("ram");

        Collections.sort(ls, com);

        System.out.println(ls);


        
    }
}
