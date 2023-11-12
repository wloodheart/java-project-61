package hexlet.code.game.impl;

import hexlet.code.game.Game;

import java.util.Random;
import java.util.Scanner;

public class Calc implements Game {

    private final String gameName = "Calc";
    private final String gameRule = "What is the result of the expression?";
    private final char[] operators = {'+', '-', '*'};
    private String question;
    private String correctAnswer;

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
        int a, b;
        char currentOperator;

        a = random.nextInt(10);
        b = random.nextInt(10);
        currentOperator = operators[random.nextInt(3)];

        question = a + " " + currentOperator + " " + b;

        switch (currentOperator) {
            case '+' -> correctAnswer = String.valueOf(a + b);
            case '-' -> correctAnswer = String.valueOf(a - b);
            case '*' -> correctAnswer = String.valueOf(a * b);
        }
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
