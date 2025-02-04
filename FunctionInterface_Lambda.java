
@FunctionalInterface
interface  A{
    void show(int i);
}


public class FunctionInterface_Lambda {
    public static void main(String[] args) {
        

        A obj = (int i) -> System.out.println(i);
        obj.show(5);
    }
}
