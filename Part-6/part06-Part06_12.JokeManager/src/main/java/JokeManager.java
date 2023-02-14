
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes = new ArrayList<>();

    public JokeManager() {
        this.jokes = jokes;
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public String drawJoke() {
        if (jokes.isEmpty()) {
            String noJokes = "Jokes are in short supply.";
            return noJokes;
        }

       Random draw = new Random();
       int index = draw.nextInt(jokes.size());
       return jokes.get(index);
    }

    public void printJokes() {
        for (int i = 0; i < jokes.size(); i++) {
            System.out.println(jokes.get(i));
        }
    }
}
