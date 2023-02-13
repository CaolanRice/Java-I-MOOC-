
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Which file should have it's contents printed?");
        String fileToPrint = scanner.nextLine();

//        if (fileToPrint.equals("data.txt") || fileToPrint.equals("song.txt")) {
            try ( Scanner filePrint = new Scanner(Paths.get(fileToPrint))) {
                while (filePrint.hasNextLine()) {                   
                    System.out.println(filePrint.nextLine());
                }
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }



