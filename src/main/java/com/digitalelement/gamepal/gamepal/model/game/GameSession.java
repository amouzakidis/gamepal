package com.digitalelement.gamepal.gamepal.model.game;

import com.digitalelement.gamepal.gamepal.model.user.User;

import java.util.List;

public class GameSession {
    public enum State {
        WAITING_FOR_PLAYERS,
        ONGOING,
        FINISHED
    };

    private int id;
    private List<User> participants;
    private Game game;
    private State state;

}
