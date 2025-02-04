



public class Throw_Throws {


    static void fun() throws IllegalAccessException{
        System.out.println("Inside fun(). ");
        throw new IllegalAccessException("demo");
    }

    public static void main(String[] args) {
        int i = 20;
        int j = 0;


        try {
            j = 18/i;
            fun();
            if(j == 0){
                throw new ArithmeticException("I dont want to print 0");
            }
            
        } catch(ArithmeticException e){
            j= 18/1;
            System.out.println("That's the default output" + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The index is out of array length");
        }catch (IllegalAccessException e) {
            System.out.println("Caught in main.");
        }catch(Exception e){
            System.out.println("something went wrong"+ e);
        }


        System.out.println(j);
    }
    
}
