interface software{

    void microsoft();

}



interface hardware{

    void intel();
}


interface  gpu extends hardware{
    void arm64();
}


class Computer implements  software, gpu{

    public void microsoft(){
        System.out.println("I am using windows os");
    }


    public void intel(){
        System.out.println("I am using Intel chips");
    }

    public void arm64(){
        System.out.println("I am using arm64 in  Intel chips");
    }



}



public class Multiple_Inheritance_interface {

    public static void main(String[] args) {
        Computer com = new Computer();

        com.arm64();
        com.microsoft();
        com.intel();
    }
    
}
