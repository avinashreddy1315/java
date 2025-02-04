public class exception {
    public static void main(String[] args) {
            int i = 2;
            int j = 18;
            String str = null;

        try{
            j = j/i;
            System.out.println(str.length());

        }
        catch(ArithmeticException e){
            System.out.println("Canot divide by zero" + e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("The index is out of array length");
        }catch(Exception e){
            System.out.println("something went wrong"+ e);
        }

        System.out.println(j);

    }
}
