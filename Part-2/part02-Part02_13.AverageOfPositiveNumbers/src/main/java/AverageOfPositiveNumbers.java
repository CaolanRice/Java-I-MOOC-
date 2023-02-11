
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double positiveNums = 0;
        double positiveCount = 0;

        while (true) {
            int num = Integer.valueOf(scanner.nextLine());

            if (num == 0) {
                break;
            } else if (num > 0) {
                positiveCount += 1;
                positiveNums += num;
            } else {
                continue;
            }
        }
        if (positiveCount + positiveNums > 0) {
            double avg = positiveNums / positiveCount;
            System.out.println(avg);
        } else {
            System.out.println("Cannot calculate the average");
        }
    }
}
