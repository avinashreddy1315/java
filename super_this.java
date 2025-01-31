
//Call the construtor of the super class
class A{ // super class

    public A(){
        this(5);
        System.out.println("in A");
    }

    public A(int n){
      
        System.out.println("in A int");
    }
   
}


class B extends A{ //sub-class

    public B(){
       super();
        System.out.println("in B");
    }

    public B(int n){
        this();
        System.err.println("in B int");
    }

    

}

public class super_this {
    public static void main(String[] args){

        B obj = new B(5);

   
        

    }
    
}
