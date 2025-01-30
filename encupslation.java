class Human{
    private int age;
    private String name;

    /*constructor must have an same name of its class its cannot have an return type
        it can acept parameter and its is called when object for thr class is created*/
    public Human(int age, String name){ //This is Parametrized constructuor
        this.age = age;
        this.name = name;
        System.out.println("in constructor");
    }


    public Human(){ //default constructor
        age = 40;
        name = "Reddy";
    }

    public int getAge(){
        return age;
    };

    public void setAge(int age){
        this.age = age;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    
}


public class encupslation {
    public static void main(String[] args) {

        Human obj1 = new Human(25, "Sandeep");
        Human obj2 = new Human();
       
        //obj1.setAge(25);
        //obj1.setName("Reddy");

        System.out.println(obj1.getAge() + " : " + obj1.getName());
        System.out.println(obj2.getAge() + " : " + obj2.getName());
      

        
    }
}
