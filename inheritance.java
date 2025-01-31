// Inheritance.java
public class inheritance {
    public static void main(String[] args) {
        //so this is multilevel inheritance
        /* this is multilevel in hertance
            calc
             |
            AdvcCalc
             |
            VAdvCalc

         */



         //so this is inheritance
        /* this is inhertance
            calc
             |
            AdvcCalc
        */
        //VAdvCalc in VAdvCalc.java file
        VAdvCalc obj = new VAdvCalc();

        // With inheritance, we can access methods from the superclass
        obj.add(6, 7);// Method from Calc
        obj.substarct(10, 5);// Method from Calc
        obj.multiply(3, 4);// Method from Calc
        obj.divide(12, 3); // Method from Calc
        obj.modules(10, 3); // Method from AdvCalc
        obj.power(2, 3); //Method from VAdvcalc

    }
}
