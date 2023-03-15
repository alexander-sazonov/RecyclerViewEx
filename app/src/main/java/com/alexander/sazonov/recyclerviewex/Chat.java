package com.alexander.sazonov.recyclerviewex;

import java.util.Objects;

public class Chat {

    private int id;
    private String name;
    private String message;
    private int imageId;

    public Chat(int id, String name, String message, int imageId) {
        this.id = id;
        this.name = name;
        this.message = message;
        this.imageId = imageId;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }

    public int getImageId() {
        return imageId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chat chat = (Chat) o;
        return id == chat.id && imageId == chat.imageId && Objects.equals(name, chat.name) && Objects.equals(message, chat.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, message, imageId);
    }
}
