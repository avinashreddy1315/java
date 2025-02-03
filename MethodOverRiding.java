

class Animal{

    public void sound(){
        System.out.println("This sound from Animal");
    }
}


class Dog extends Animal{

    // this is @Method over riding
    @Override
    public void sound(){
        System.out.println("This sound from Dog");
    }
}



public class MethodOverRiding {

    public static void main(String[] args) {
        
        Animal ani2 = new Animal();
        ani2.sound();


        Animal ani = new Dog();

        ani.sound();
    }
    
}
