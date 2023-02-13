
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Statistics statistics = new Statistics();
        Statistics inputSum = new Statistics();
        Statistics totalSum = new Statistics();
        Statistics evenSum = new Statistics();
        Statistics oddSum = new Statistics();
        
        System.out.println("Enter numbers:");
        while (true) {
            int input = Integer.valueOf(scanner.nextLine());
            if (input == -1){
                break;
            }
            if (input % 2 == 0){
                evenSum.addNumber(input);
            }
            else if(input % 2 != 0){
                oddSum.addNumber(input);
            }
            inputSum.addNumber(input);
        }
        System.out.println("Sum: " +inputSum.sum());
        System.out.println("Sum of even numbers: " +evenSum.sum());
        System.out.println("Sum of odd numbers: " +oddSum.sum());
        

        
//        statistics.addNumber(3);
//        statistics.addNumber(5);
//        statistics.addNumber(1);
//        statistics.addNumber(2);
//        System.out.println("Count: " + statistics.getCount());
//        System.out.println("Sum: " + statistics.sum());
//        System.out.println("Average: " + statistics.average());
        
        
    }
}
