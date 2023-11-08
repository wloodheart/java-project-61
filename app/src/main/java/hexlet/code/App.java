package hexlet.code;

import hexlet.code.game.Game;
import hexlet.code.game.impl.Even;
import hexlet.code.game.impl.Exit;
import hexlet.code.game.impl.Greet;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to the Brain Games!");

        List<Game> games = new ArrayList<>();
        games.add(new Exit());
        games.add(new Greet());
        games.add(new Even());


        while (true) {
            Cli.showGameList(games);
            games.get(Integer.parseInt(Cli.ask("Your choice: "))).start();
        }
    }
}
