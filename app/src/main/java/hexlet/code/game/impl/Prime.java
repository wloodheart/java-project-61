package hexlet.code.game.impl;

import hexlet.code.game.Game;

import java.util.Random;

public final class Prime implements Game {
    private final String gameName = "Prime";
    private final String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
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
        final int randomRange = 100;
        int num;

        num = random.nextInt(randomRange);
        question = String.valueOf(num);
        correctAnswer = getCorrectAnswerByNum(num);

    }

    private String getCorrectAnswerByNum(int num) {
        if (num <= 1) {
            return "no";
        }

        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return "no";
            }
        }
        return "yes";
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
