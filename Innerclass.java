

class A{

    int age;

    public void show(){
        System.out.println("in show");
    }


    class B{
        public void config(){
            System.out.println("in config");
        }
    }

}




public class Innerclass {
    public static void main(String[] args) {
        //anonymous inner class chnagng the behaviour of show method.
        A obj = new A(){
            public void show(){
                System.out.println("in new show");
            }
        };

        obj.show();
        

        //calling an inner class class B which is inside A.
        A.B obj1 = obj.new B();
        obj1.config();
    }
}
