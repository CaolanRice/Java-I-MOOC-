
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double val = Double.valueOf(scan.nextLine());
      
        if (val >= 5000 && val <= 25000){
            val = (100+(val-5000)* 0.08);
            System.out.println("Tax: " + val);
        } else if (val >= 25000 && val <= 55000){
            val = (1700+(val-25000)*0.10);
            System.out.println("Tax: " + val);
        } else if (val >= 55000 && val <= 200000){
            val = (4700+(val-55000)*0.12);
            System.out.println("Tax: " + val);
        } else if (val >= 200000 && val <= 1000000){
            val = (22100+(val-200000)* 0.15);
            System.out.println("Tax: " + val);
        } else if (val >= 1000000){
            val = (142100+(val-1000000) * 0.17);
            System.out.println("Tax: " + val);
        } else {
            System.out.println("No tax!");
        }
    }
}
