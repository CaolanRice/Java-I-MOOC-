
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = 0;
        String name = "";
        
        while(true){
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            String[] splitUp = input.split(",");
            int check = Integer.valueOf(splitUp[1]);
            
            for(int i = 0; i < splitUp.length; i++){
                if (check > oldest){
                    name = splitUp[0];
                    oldest = check;
                }
            }
            
        }System.out.println("Name of the oldest: " + name);
    }
}
