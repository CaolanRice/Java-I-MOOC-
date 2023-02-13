
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // implement here the program that allows the user to enter 
        // book information and to examine them
        Scanner scanner = new Scanner(System.in);
        ArrayList<Book> bookInfo = new ArrayList<>();

        while (true) {
            System.out.println("Title:");
            String title = scanner.nextLine();
            if (title.isEmpty()) {
                break;
            }
            System.out.println("Pages:");
            Integer pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year:");
            Integer pubYear = Integer.valueOf(scanner.nextLine());
            bookInfo.add(new Book(title, pages, pubYear));
        }
        System.out.println("What information will be printed?");
        String printed = scanner.nextLine();
        for(Book books: bookInfo){
            if (printed.equals("name")){
                System.out.println(books.getName());
            } else if(printed.equals("everything")) {
                System.out.println(books);
            }
        }
        
    }
}
