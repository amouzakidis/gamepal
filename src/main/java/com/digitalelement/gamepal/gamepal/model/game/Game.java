package com.digitalelement.gamepal.gamepal.model.game;

import com.digitalelement.gamepal.gamepal.model.user.User;

import java.util.List;

public abstract class Game {

    public abstract void start(List<User> users);

    public abstract String getLastMove();

    public abstract String submitNewMove(String move);

}
