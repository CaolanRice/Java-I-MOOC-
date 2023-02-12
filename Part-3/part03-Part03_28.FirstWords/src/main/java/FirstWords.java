
import java.util.Scanner;

public class FirstWords {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String message = scanner.nextLine();
            
            if (message.equals("")){
                break;
            }
            
            String[] splitUp = message.split(" ");
            System.out.println(splitUp[0]);
            
        }

    }
}
