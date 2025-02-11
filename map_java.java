
import java.util.HashMap;
import java.util.Map;

public class map_java {
    public static void main(String[] args) {
        Map<String, Integer> mp = new HashMap<>();


        mp.put("avinash", 25);
        mp.put("tanuja", 22);

        


        //System.out.println(mp.get("avinash"));

        for(String name : mp.keySet()){
            System.out.println(name + " " + mp.get(name));
        }
    }
}
