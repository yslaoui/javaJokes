package joke;

import java.util.ArrayList;
import java.util.Random;

public class JokeManager {

    ArrayList<String> jokes;

    public JokeManager() {
        this.jokes = new ArrayList<>();
    }

    public void addJoke(String joke) {
        jokes.add(joke);
    }

    public void printJokes() {
        for (String joke: jokes) {
            System.out.println(joke);
        }
    }

    public void drawJoke() {
        Random random = new Random();
        System.out.println(this.jokes.get(random.nextInt(this.jokes.size())));
    }
}
