package hexlet.code;

import hexlet.code.game.Game;

import java.util.List;
import java.util.Scanner;

public class Cli {
    public static String ask(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(message);
        return scanner.next();
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void showGameList(List<Game> games) {
        System.out.println("Please enter the game number and press Enter.");
        for (int i = 1; i < games.size(); i++) {
            System.out.println(i + " - " + games.get(i).getGameName());
        }
        System.out.println("\n0 - " + games.get(0).getGameName());
    }
}
