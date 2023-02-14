
import java.util.Scanner;

public class TextUI {

    private Scanner scanner;
    private SimpleDictionary dict;

    public TextUI(Scanner scanner, SimpleDictionary dict) {
        this.scanner = scanner;
        this.dict = dict;
    }

    public void start() {
        while (true) {
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("end")) {
                System.out.println("Bye bye!");
                break;
            } else if (command.equals("add")) {
                System.out.println("Word:");
                String word = scanner.nextLine();
                System.out.println("Translation:");
                String translation = scanner.nextLine();
                dict.add(word, translation);
            } else if (command.equals("search")){
                System.out.println("To be translated:");
                String toBe = scanner.nextLine();
                if (dict.translate(toBe) == null){
                    System.out.println("Word " + toBe + " was not found");
                } else{
                    System.out.println(dict.translate(toBe));
                }          
            } 
            else {
                System.out.println("Unknown command");
            }
        }

    }
}
