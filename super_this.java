

class A{ // super class

    public A(){
        System.out.println("in A");
    }
   
}


class B extends A{ //sub-class

    public B(){
        
        System.out.println("in B");
    }

    

}

public class super_this {
    public static void main(String[] args){

        B obj = new B();

   
        

    }
    
}
