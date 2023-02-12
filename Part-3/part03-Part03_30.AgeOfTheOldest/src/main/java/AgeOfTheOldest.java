
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int oldest = 0;
        while (true) {
            String message = scanner.nextLine();

            if (message.equals("")) {
                break;
            }

            String[] splitUp = message.split(",");
            
           
            int check = Integer.valueOf(splitUp[1]);
            for (int i = 0; i < splitUp.length; i++){
                if (check > oldest){
                    oldest = check;
                }
            }
            
            
        }
        System.out.println("Age of the oldest: " + oldest);
        
    }
}
