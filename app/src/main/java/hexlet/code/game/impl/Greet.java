package hexlet.code.game.impl;

import hexlet.code.Cli;
import hexlet.code.game.Game;

public class Greet implements Game {
    @Override
    public void start() {
        Cli.greet(Cli.ask("May I have your name?"));
    }

    @Override
    public String getGameName() {
        return "Greet";
    }
}
