package hexlet.code;

import hexlet.code.game.Game;
import hexlet.code.game.impl.Calc;
import hexlet.code.game.impl.Even;
import hexlet.code.game.impl.GreatestCommonDivisor;
import hexlet.code.game.impl.Progression;
import hexlet.code.game.impl.Prime;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine();
        final int arrayOffset = 2;

        List<Game> games = List.of(
                new Even(),
                new Calc(),
                new GreatestCommonDivisor(),
                new Progression(),
                new Prime()
        );

        System.out.println("""
                Please enter the game number and press Enter.
                1 - Greet
                2 - Even
                3 - Calc
                4 - GCD
                5 - Progression
                6 - Prime
                0 - Exit""");

        int userChoice = Integer.parseInt(engine.enterFromConsole("Your choice: "));
        switch (userChoice) {
            case 0 -> System.exit(0);
            case 1 -> engine.greet();
            default -> engine.playGame(games.get(userChoice - arrayOffset));
        }
    }
}
