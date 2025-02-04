
@FunctionalInterface
interface  A{
    void show(int i);
}


public class FunctionInterface_Lambda {
    public static void main(String[] args) {
        

        A obj = (int i) -> System.out.println(i);
        obj.show(5);

        //this is if it returns the statment;
        /*A obj = (int i) ->{ return i*i; };
        System.out.println(obj.show(5)); */


    }
}
