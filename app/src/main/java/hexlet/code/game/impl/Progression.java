package hexlet.code.game.impl;

import hexlet.code.game.Game;

import java.util.Random;

public final class Progression implements Game {
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
        final int randomRange = 10;
        final int offset = 5;
        StringBuilder sequence = new StringBuilder();
        int firsValue;
        int step;
        int size;
        int missingPos;

        firsValue = random.nextInt(randomRange);
        step = random.nextInt(randomRange);
        size = random.nextInt(randomRange) + offset;
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
