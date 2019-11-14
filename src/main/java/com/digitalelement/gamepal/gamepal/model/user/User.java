package com.digitalelement.gamepal.gamepal.model.user;

import java.util.Map;

public class User {
    public enum Status {
        IDLE, PLAYIN
    };

    private int id;
    private Map<String, String> metadata;
    private Status status;

    public User(int id, Map<String, String> metadata) {
        this.id = id;
        this.metadata = metadata;
        this.status = Status.IDLE;
    }

    public User(int id, Map<String, String> metadata, Status status) {
        this.id = id;
        this.metadata = metadata;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
