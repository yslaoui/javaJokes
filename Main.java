package joke;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        JokeManager jokeManager = new JokeManager();
        UserInterface ui = new UserInterface(scanner, jokeManager);
        ui.start();
    }
}
