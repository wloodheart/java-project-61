package hexlet.code.game.impl;

import hexlet.code.game.Game;

public class Exit implements Game {
    @Override
    public void start() {
        System.exit(0);
    }

    @Override
    public String getGameName() {
        return "Exit";
    }
}
