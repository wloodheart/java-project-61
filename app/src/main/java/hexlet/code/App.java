package hexlet.code;

import hexlet.code.game.Game;
import hexlet.code.game.impl.Calc;
import hexlet.code.game.impl.Even;

import java.util.List;

public class App {
    public static void main(String[] args) {

        List<Game> games = List.of(
                new Even(),
                new Calc()
        );

        Engine engine = new Engine(games);
        engine.start();
    }
}
