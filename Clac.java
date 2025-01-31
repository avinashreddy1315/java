// Clac.java

//This is Super class for inherting methods the subclass is AdvCalc
public class Clac { // Superclass
    public void add(int a, int b) {
        System.out.println("from add " + (a + b));
    }

    public void substarct(int a, int b) {
        System.out.println("from substarct " + (a - b));
    }

    public void multiply(int a, int b) {
        System.out.println("from multiply " + (a * b));
    }

    public void divide(int a, int b) {
        if (b != 0) {
            System.out.println("from divide " + (a / b));
        } else {
            System.out.println("Cannot divide by zero.");
        }
    }
}

