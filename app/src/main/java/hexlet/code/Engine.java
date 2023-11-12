package hexlet.code;

import hexlet.code.game.Game;

import java.util.List;
import java.util.Scanner;

public class Engine {
    private final List<Game> games;
    private String userName;
    private final int GAME_ITERATION = 3;

    public Engine(List<Game> games) {
        this.games = games;
    }

    public List<Game> getGames() {
        return games;
    }

    public void start() {
        while (true) {
            showGameList();
            int userChoice = Integer.parseInt(enterFromConsole("Your choice: "));
            switch (userChoice) {
                case 0 -> System.exit(0);
                case 1 -> greet();
                default -> {
                    greet();
                    playGame(games.get(userChoice - 2));
                }
            }
        }
    }

    private void playGame(Game game) {
        String userAnswer;

        System.out.println(game.getGameRule());

        for (int i = 0; i < GAME_ITERATION; i++) {
            game.initNextQuestionValues();
            userAnswer = enterFromConsole("Question: " + game.getQuestion() + "\nYour answer: ");
            if (!userAnswer.equalsIgnoreCase(game.getCorrectAnswer())) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + game.getCorrectAnswer() +
                        ".\nLet's try again, " + userName);
                i = -1;
            } else {
                System.out.println("Correct");
            }
        }
        System.out.println("Congratulations! " + userName);
    }

    private String enterFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next();
    }

    private void greet() {
        if (userName == null) {
            userName = enterFromConsole("Welcome to the Brain Games!\nMay I have your name? ");
        }
        System.out.println("Hello, " + userName + "!");
    }

    public void showGameList() {
        System.out.println("Please enter the game number and press Enter." +
                "\n1 - Greet");

        for (int i = 0; i < games.size(); i++) {
            System.out.println(i + 2 + " - " + games.get(i).getGameName());
        }
        System.out.println("\n0 - Exit");
    }
}
