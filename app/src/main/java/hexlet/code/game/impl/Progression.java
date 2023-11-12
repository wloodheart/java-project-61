package hexlet.code.game.impl;

import hexlet.code.game.Game;

import java.util.Random;

public class Progression implements Game {
    private final String gameName = "Progression";
    private final String gameRule = "What number is missing in the progression?";
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
        StringBuilder sequence = new StringBuilder();
        int firsValue, step, size, missingPos;

        firsValue = random.nextInt(100);
        step = random.nextInt(100);
        size = random.nextInt(10) + 5;
        missingPos = random.nextInt(size);
        sequence.append(firsValue);

        for (int i = 1; i < size; i++) {
            if (i == missingPos) {
                sequence.append(" ..");
            } else {
                sequence.append(" ").append(firsValue + step * i);
            }
        }

        question = sequence.toString();
        correctAnswer = String.valueOf(firsValue + step * missingPos);
    }

    private void fill(int[] array) {

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
