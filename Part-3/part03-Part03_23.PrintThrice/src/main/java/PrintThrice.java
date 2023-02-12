
import java.util.Scanner;

public class PrintThrice {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("What's your name? ");
        String name = reader.nextLine();

        System.out.println(name + name + name);


    }
}
