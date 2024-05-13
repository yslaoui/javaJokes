package joke;

import java.util.Scanner;

public class UserInterface {

    Scanner scanner;
    JokeManager jokeManager;

    public UserInterface(Scanner scanner, JokeManager jokeManager) {
        this.scanner = scanner;
        this.jokeManager = jokeManager;
    }

    public void start() {
        String input;
        do {
            System.out.println("Commands: \n 1- add a joke " +
                    " \n 2-draw a joke " +
                    " \n 3- list jokes" +
                    " \n X- stops" );

            input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("Write the joke to be added: ");
                this.jokeManager.addJoke(scanner.nextLine());
            }

            if (input.equals("2")) {
                System.out.println("Drawing a random joke");
                this.jokeManager.drawJoke();
            }

            if (input.equals("3")) {
                System.out.println("Listing jokes:");
                this.jokeManager.printJokes();
            }


        } while (!(input.equals("X")));
    }


}
