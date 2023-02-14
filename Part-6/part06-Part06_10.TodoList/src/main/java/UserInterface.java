import java.util.Scanner;

public class UserInterface {

    private TodoList tasks;
    private Scanner scanner;

    public UserInterface(TodoList tasks, Scanner scanner) {
        this.tasks = tasks;
        this.scanner = scanner;

    }
    
    public void start(){
        while (true){
            System.out.println("Command:");
            String command = scanner.nextLine();
            if (command.equals("stop")){
                break;
            } else if(command.equals("add")){
                System.out.println("To add:");
                String toAdd = scanner.nextLine();
                tasks.add(toAdd);
            } else if (command.equals("list")){
                tasks.print();
            } else if (command.equals("remove")){
                System.out.println("Which one is removed?");
                Integer toRemove = Integer.valueOf(scanner.nextLine());
                tasks.remove(toRemove);
            } else{
                continue;
            }
        }
    }

}
