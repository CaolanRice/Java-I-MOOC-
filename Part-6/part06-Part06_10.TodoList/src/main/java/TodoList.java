
import java.util.ArrayList;

public class TodoList {

    private ArrayList<String> tasks;

    public TodoList() {
        tasks = new ArrayList<>();
    }

    public void add(String task) {
        tasks.add(task);
    }

    public void print() {
//        for (String items : tasks) {
//            System.out.println((tasks.indexOf(items) + 1) + ": " + items);
//        }
        for (int i = 0; i < tasks.size(); i++){
            System.out.println((i + 1) + ": " + tasks.get(i));
        }
    }

    public void remove(int number) {
        tasks.remove(number - 1);
    }
}
