
import java.util.Scanner;

public class mainProgram {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        BirdDB birds = new BirdDB();

        System.out.println("Enter command:");
        String command = scan.nextLine();
        
        while (true){
        if (command.equals("Quit")) {
            break;
        }
        if (command.equals("Add")){
            birds.addBird(scan);
        }
        if (command.equals("Observation")){
            birds.observeBird(scan);
        }
        if (command.equals("All")){
            System.out.println(birds);
        }
        if (command.equals("One")){
            birds.retrieveOneBird(scan);
        }

    }

}
}