
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("File:");
        String fileName = scan.nextLine();    
        System.out.println("Team:");
        String teamName = scan.nextLine();
        int count = 0;
        int wins = 0;
        int losses = 0;
        
        try(Scanner scanner = new Scanner(Paths.get(fileName))){
            while(scanner.hasNextLine()){
                String line = scanner.nextLine();

                String[] parts = line.split(",");
                String firstTeam = parts[0];
                String secondTeam = parts[1];
                int firstScore = Integer.valueOf(parts[2]);
                int secondScore = Integer.valueOf(parts[3]);
                
                if(firstTeam.contains(teamName) && firstScore > secondScore || secondTeam.contains(teamName) && secondScore > firstScore){
                    wins++;
                    count++;
                } else if (firstTeam.contains(teamName) && firstScore < secondScore || secondTeam.contains(teamName) && secondScore < firstScore){
                    losses++;
                    count++;
                } else{
                    continue;
                }
            }
            
        }catch(Exception e){
            System.out.println("Error" + e.getMessage());
        }
        System.out.println("Games: " + count + "\n" + "Wins: " + wins + "\n" + "Losses: " + losses);
        
    }

}
