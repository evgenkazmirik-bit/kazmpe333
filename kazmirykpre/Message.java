package com.meter;

import java.time.LocalDateTime;

public class Message package com.meter;

import java.time.LocalDateTime;

public class Message {
    private int id;
    private String eventType; // INFO, WARNING, ERROR
    private LocalDateTime timestamp;
    private String text;
    private boolean isRead;

    public Message() {}

    public Message(int id, String eventType, LocalDateTime timestamp, String text, boolean isRead) {
        this.id = id;
        this.eventType = eventType;
        this.timestamp = timestamp;
        this.text = text;
        this.isRead = isRead;
    }

    public void markAsRead() {
        this.isRead = true;
        System.out.println("Повідомлення #" + id + " позначено як прочитане.");
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", eventType='" + eventType + '\'' +
                ", timestamp=" + timestamp +
                ", text='" + text + '\'' +
                ", isRead=" + isRead +
                '}';
    }
}