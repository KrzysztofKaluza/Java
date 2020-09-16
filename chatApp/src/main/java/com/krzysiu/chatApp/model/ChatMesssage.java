package com.krzysiu.chatApp.model;

public class ChatMesssage {
    private MessageType type;
    private String content;
    private String sender;

    public void setType(MessageType type) {
        this.type = type;
    }

    public enum MessageType{
        CHAT,
        JOIN,
        LEAVE
    }

    public MessageType getType() {
        return type;
    }

    public String getContent() {
        return content;
    }

    public String getSender() {
        return sender;
    }



    public void setContent(String content) {
        this.content = content;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }
}
