package hexlet.code.game.impl;

import hexlet.code.game.Game;

import java.util.Random;

public final class GreatestCommonDivisor implements Game {
    private final String gameName = "GCD";
    private final String gameRule = "Find the greatest common divisor of given numbers.";
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
        int RANDOM_RANGE = 100;
        int a;
        int b;

        a = random.nextInt(RANDOM_RANGE);
        b = random.nextInt(RANDOM_RANGE);
        question = a + " " + b;

        correctAnswer = String.valueOf(gcdByEuclidAlgorithm(a, b));
    }

    private int gcdByEuclidAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdByEuclidAlgorithm(n2, n1 % n2);
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
