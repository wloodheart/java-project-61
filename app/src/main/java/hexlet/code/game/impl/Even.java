package hexlet.code.game.impl;

import hexlet.code.game.Game;

import java.util.Random;

public final class Even implements Game {

    private final String gameName = "Even";
    private final String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";
    private int question;
    private String correctAnswer;

    @Override
    public String getGameName() {
        return "Even";
    }

    @Override
    public String getGameRule() {
        return gameRule;
    }

    @Override
    public void initNextQuestionValues() {
        Random random = new Random();
        final int randomRange = 100;
        question = random.nextInt(randomRange);
        correctAnswer = getCorrectAnswerByQuestion(question);
    }

    @Override
    public String getQuestion() {
        return String.valueOf(question);
    }

    @Override
    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public String getCorrectAnswerByQuestion(int num) {
        if (num % 2 == 0) {
            return "yes";
        } else {
            return "no";
        }
    }
}
