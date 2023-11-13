package hexlet.code.game.impl;

import hexlet.code.game.Game;

import java.util.Random;

public final class Calc implements Game {

    private final String gameName = "Calc";
    private final String gameRule = "What is the result of the expression?";
    private final char[] operators = {'+', '-', '*'};
    private String question;
    private String correctAnswer;
    private final int RANDOM_RANGE = 10;

    @Override
    public String getGameName() {
        return gameName;
    }

    @Override
    public String getGameRule() {
        return gameRule;
    }

    @Override
    public void initNextQuestionValues() {
        Random random = new Random();
        int a;
        int b;
        char currentOperator;

        a = random.nextInt(RANDOM_RANGE);
        b = random.nextInt(RANDOM_RANGE);
        currentOperator = operators[random.nextInt(operators.length)];

        question = a + " " + currentOperator + " " + b;

        switch (currentOperator) {
            case '+' -> addition(a, b);
            case '-' -> subtraction(a, b);
            case '*' -> multiplication(a, b);
            default -> System.exit(0);
        }
    }

    private void addition(int a, int b) {
        correctAnswer = String.valueOf(a + b);
    }

    private void subtraction(int a, int b) {
        correctAnswer = String.valueOf(a - b);
    }

    private void multiplication(int a, int b) {
        correctAnswer = String.valueOf(a * b);
    }

    @Override
    public String getQuestion() {
        return question;
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }
}
