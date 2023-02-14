
import java.nio.file.Paths;
import java.util.Scanner;
import java.util.ArrayList;

public class RecordsFromAFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Name of the file: ");
        String fileName = scanner.nextLine();
        
        try (Scanner search = new Scanner(Paths.get(fileName))) {

        while (search.hasNextLine()) {
            String line = search.nextLine();

            String[] parts = line.split(",");
            String name = parts[0];
            int age = Integer.valueOf(parts[1]);
            
            if (age == 1){
                System.out.println(name +", age: " + age + " year");
            } else {
                System.out.println(name +", age: " + age + " years");
            }
            
            
    }
    } catch(Exception e){
            System.out.println("Error" + e.getMessage());
    }
        
    }
}
