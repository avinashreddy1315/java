interface Computer{

    final int stack = 50;
    //by default this are abstarct method
    void display();
}



class Laptop implements Computer{

    public void display(){
        System.out.println("display from LAPTOP");
    }
}




public class Interface {
    public static void main(String[] args) {
        Computer lap = new Laptop();
        lap.display();
        System.err.println(Computer.stack);
    }
}
