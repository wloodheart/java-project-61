package hexlet.code;

import hexlet.code.game.Game;

import java.util.Scanner;

public class Engine {
    private String userName;
    public void playGame(Game game) {
        String userAnswer;

        greet();
        System.out.println(game.getGameRule());

        for (int i = 0; i < 3; i++) {
            game.initNextQuestionValues();
            userAnswer = enterFromConsole("Question: " + game.getQuestion() + "\nYour answer: ");
            if (!userAnswer.equalsIgnoreCase(game.getCorrectAnswer())) {
                System.out.println("'" + userAnswer + "' is wrong answer ;(. Correct answer was '"
                        + game.getCorrectAnswer() + "'.\nLet's try again, " + userName);
                System.exit(0);
            } else {
                System.out.println("Correct");
            }
        }
        System.out.println("Congratulations, " + userName);
    }

    public String enterFromConsole(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next();
    }

    public void greet() {
        userName = enterFromConsole("\nWelcome to the Brain Games!\nMay I have your name? ");
        System.out.println("Hello, " + userName + "!");
    }
}
