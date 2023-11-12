package hexlet.code.game;

public interface Game {

    String getGameName();

    String getGameRule();

    void initNextQuestionValues();

    String getQuestion();

    String getCorrectAnswer();
}
