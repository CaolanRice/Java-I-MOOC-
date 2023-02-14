
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        while (true) {
            System.out.println("First:" + first + "/100");
            System.out.println("Second:" + second + "/100");
            String input = scan.nextLine();

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (input.equals("quit")) {
                break;

            }
            if (command.equals("add") && amount > 0) {
                first += amount;
                if (first > 100) {
                    first = 100;
                }

                if (command.equals("move")) {
                    if (amount >= 100 && first == 100) {
                        first = 0;
                        second = 100;
                    } else if (first == 0) {
                        continue;
                    } else if (first >= amount && second + amount > 100) {
                        second = 100;
                        first -= amount;
                    } else if (first >= amount) {
                        second += amount;
                        first -= amount;
                    } else {
                        second += first;
                        first = 0;
                    }
                    
                    if (command.equals("remove")) {
                        if (second - amount < 0) {
                            second = 0;
                        } else {
                            second -= amount;
                        }
                    }
                }
            }
        }
    }
}

        
