
import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    private ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        this.jokes.add(joke);
    }

    public void printJokes() {
        for (String joke : jokes) {
            System.out.println(joke);
        }
    }

    public String drawJoke() {
        if (this.jokes.isEmpty()) {
            return "Jokes are in short supply.";
        }

        Random rand = new Random();
        return this.jokes.get(rand.nextInt(jokes.size()));
    }

}
