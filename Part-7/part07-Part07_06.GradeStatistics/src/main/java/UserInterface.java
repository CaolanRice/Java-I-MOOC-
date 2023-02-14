
import java.util.ArrayList;
import java.util.Scanner;

public class UserInterface {

    private Scanner scanner;
    private ArrayList<Integer> scores;

    public UserInterface(Scanner scanner) {
        this.scanner = new Scanner(System.in);
        this.scores = new ArrayList<>();
    }


    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        while (true) {
            int points = Integer.valueOf(scanner.nextLine());
            if (points == -1) {
                break;
            }
            if (points >= 0 && points <= 100) {
                this.scores.add(points);
            }
        }
    }

    public double average(int sum, int counter) {
        double average = (1.0) * sum / counter;
        return average;
    }

    public double pointAverageAll() {
        int sum = 0;
        int counter = 0;
        for (int score : scores) {
            sum += score;
            counter++;
        }
        return this.average(sum, counter);
    }

    public double pointAveragePassingGrade() {
        int sum = 0;
        int counter = 0;
        for (int score : scores) {
            if (score >= 50) {
                sum += score;
                counter++;
            }
        }
        return this.average(sum, counter);
    }

    public double passPercentage() {
        double counter = 0;
        double total = 0;
        for (int score : scores) {
            if (score >= 50) {
                counter++;
            }
            total++;
        }
        double percentage = 1.0 * (100 * (counter / total));
        return percentage;
    }

    public String passingGradeHelper() {
        double average = this.pointAveragePassingGrade();
        if (Double.isNaN(average)) {
            return "-";
        }
        return Double.toString(average);
    }

    public void pointsToGrade() {
        Grades gradeDist = new Grades(scores);
        gradeDist.scoreToGradeConvertor();
        System.out.println(gradeDist);
    }

    public String toString() {
        return "Point average (all): " + this.pointAverageAll() + "\n"
                + "Point average(passing): " + this.passingGradeHelper() + "\n"
                + "Pass percentage: " + this.passPercentage();

    }

}
