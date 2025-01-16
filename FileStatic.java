
class Mobile{
    String brand;
    int price;
    static String name;

    static {
        name = "Iphone";
    }


    public void show(){
        System.out.println(brand + " : " + price + " : " + name);
    }

    public static void show1(){
        System.out.println("In static method");
    }

}


public class FileStatic {
    public static void main(String[] args) {
        /*Mobile obj1 = new Mobile();

        obj1.brand = "Apple";
        obj1.price = 1500;
       


        Mobile obj2 = new Mobile();

        obj2.brand = "Samsung";
        obj2.price = 1200;
       
        
  
        obj1.show();
        obj2.show(); */
        Mobile.show1();
    }
}
