
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;


public class NumbersFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("File? ");
        String file = scanner.nextLine();
        System.out.println("Lower bound? ");
        int lowerBound = Integer.valueOf(scanner.nextLine());
        System.out.println("Upper bound? ");
        int upperBound = Integer.valueOf(scanner.nextLine());
        ArrayList<Integer> list = new ArrayList<>();
        int count = 0;
        
        try(Scanner fileContents = new Scanner(Paths.get(file))){
            while(fileContents.hasNextLine()){
                list.add(Integer.valueOf(fileContents.nextLine()));
            }
            for (int value: list){
                if(value <= upperBound && value >= lowerBound){
                    count++; 
                }
            }
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
        
        System.out.println("Numbers: " + count);
        
        
    }
}

