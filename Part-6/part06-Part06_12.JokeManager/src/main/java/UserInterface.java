
import java.util.Scanner;

public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner){
        this.jokes = jokes;
        this.scanner = scanner;
    }
    public void start(){
        while (true){
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes");
            System.out.println("X - stop");
            String command = scanner.nextLine();
            if (command.equals("1")){
                System.out.println("Write the joke to be added:");
                String addedJoke = scanner.nextLine();
                jokes.addJoke(addedJoke);
            } else if (command.equals("2")){
                System.out.println(jokes.drawJoke());
            } else if (command.equals("3")){
                jokes.printJokes();
            } else if (command.equals("X")){
                break;
            }
        }
    }
}
