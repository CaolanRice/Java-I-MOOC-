
import java.util.Scanner;

public class AVClub {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String input = scanner.nextLine();
            
            if (input.equals("")){
                break;
            }
            
            String[] split = input.split(" ");
            for (String part : split) {
                if (part.contains("av")){
                    System.out.println(part);
                }
//            System.out.println(split[i]);
        }
        }
        
        
    }
}
