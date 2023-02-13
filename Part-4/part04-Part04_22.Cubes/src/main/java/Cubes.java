
import java.util.Scanner;

public class Cubes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while(true){
            String inputs = scanner.nextLine();
            if(inputs.equals("end")){
                break;
            }
            Integer cubed = Integer.valueOf(inputs);
            System.out.println((cubed * cubed * cubed));
        }
    }
}
