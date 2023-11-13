package hexlet.code;

import hexlet.code.game.Game;
import hexlet.code.game.impl.*;

import java.util.List;

public class App {
    public static void main(String[] args) {
        Engine engine = new Engine();

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
            case 2 -> engine.playGame(new Even());
            case 3 -> engine.playGame(new Calc());
            case 4 -> engine.playGame(new GCD());
            case 5 -> engine.playGame(new Progression());
            case 6 -> engine.playGame(new Prime());
        }
    }
}
