package com.alexander.sazonov.recyclerviewex;

public class Chat {
    private String name;
    private String message;
    private int imageId;

    public Chat(String name, String message, int imageId) {
        this.name = name;
        this.message = message;
        this.imageId = imageId;
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
}
