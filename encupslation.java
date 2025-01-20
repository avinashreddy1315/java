class Human{
    private int age;
    private String name;

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

        Human obj1 = new Human();
        obj1.setAge(25);
        obj1.setName("Reddy");

        System.out.println(obj1.getAge() + " : " + obj1.getName());

        
    }
}
