package hexlet.code.game.impl;

import hexlet.code.Cli;
import hexlet.code.game.Game;

import java.util.Random;

public class Even implements Game {
    String userName;

    @Override
    public void start() {
        System.out.println("Welcome to the Brain Games!");
        userName = Cli.ask("May I have your name? ");
        Cli.greet(userName);
        evenGame();
    }

    @Override
    public String getGameName() {
        return "Even";
    }

    private void evenGame() {
        Random random = new Random();
        int num;
        String correctAnswer;
        String userAnswer;

        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        for (int i = 0; i < 3; i++) {
            num = random.nextInt(100);
            correctAnswer = getCorrectAnswer(num);
            userAnswer = Cli.ask("Question: " + num + "\nYour answer: ");

            if (!userAnswer.equalsIgnoreCase(correctAnswer)) {
                System.out.println(userAnswer + " is wrong answer ;(. Correct answer was " + correctAnswer +
                        ".\nLet's try again, " + userName);
                i = -1;
            } else {
                System.out.println("Correct");
            }
        }
        System.out.println("Congratulations! " + userName);
    }

    private String getCorrectAnswer(int num) {
        if (num % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
