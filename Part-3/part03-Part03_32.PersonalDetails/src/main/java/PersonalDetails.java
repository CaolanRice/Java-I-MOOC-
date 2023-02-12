
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        String longestName = "";
        int count = 0;

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("")) {
                break;
            }

            String[] splitUp = input.split(",");
            int check = Integer.valueOf(splitUp[1]);
            int nameCheck = splitUp[0].length();
            
            for (int i = 0; i < splitUp.length; i++) {
                if(nameCheck > longestName.length()){
                    longestName = splitUp[0];
                }
                sum += check;
                count += 1;
            }

        }
        System.out.println("Longest name: " + longestName);
        System.out.println("Average of the birth years: " + (1.0 * sum / count));

    }
}
