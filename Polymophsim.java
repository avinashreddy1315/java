

class A{

    public void show(){
        System.out.println("this is class A");
    }

}

class B extends  A{
    @Override
    public void show(){
        System.out.println("this is class B");
    }
}

class C extends A{
    @Override
    public void show(){
        System.out.println("this is class C");
    }
}


public class Polymophsim {
    public static void main(String[] args) {
        //This is Run time polymorphsim

        /*All this is called dynamic method dispathch because 
        its dynamic wich method it will call we are not sure */
        A obj = new A();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();
        
    }
}
