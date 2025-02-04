
import java.io.IOException;
import java.util.Scanner;




public class Taking_Input_From_User {
    public static void main(String[] args) throws IOException {
      

        /*InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader bf = new BufferedReader(in);


        int num = Integer.parseInt(bf.readLine()); */
        Scanner scanner = new Scanner(System.in);

        

        System.out.println("Enter your name");

        String name = scanner.nextLine();
        System.out.println(name);

        System.out.println("Enter a number");
        int num = scanner.nextInt();
        System.out.println(num);

    }
}
