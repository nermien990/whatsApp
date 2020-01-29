package com.example.whatsapp;

public class Chat {

    private int image_chat;
    private String Chat_name;

    public Chat(int image_chat, String chat_name) {
        this.image_chat = image_chat;
        Chat_name = chat_name;
    }


    public int getImage_chat() {
        return image_chat;
    }

    public String getChat_name() {
        return Chat_name;
    }
}
