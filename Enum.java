enum Laptop{
    MACBOOK(2000), XPS(2200), SURFACE(), THINKPAD(1800);


    private int price;


    private Laptop(){
        price = 500;
    };

    private Laptop(int price){
        this.price = price;
    }


    public int getPrice() {
        return price;
    }


    public void setPrice(int price) {
        this.price = price;
    }

    

}


public class Enum {
    public static void main(String[] args) {
        /*Laptop lap = Laptop.MACBOOK;
        System.out.println(lap.getPrice()); */


        for(Laptop lap : Laptop.values()){

            System.out.println(lap + " : " + lap.getPrice());

        }
    }
}
