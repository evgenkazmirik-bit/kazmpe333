package com.meter;

public abstract class BaseEntity {
    protected int id;
    protected String status;

    public BaseEntity() {}

    public BaseEntity(int id, String status) {
        this.id = id;
        this.status = status;
    }

    // Метод для перевизначення в нащадках
    public void displaySummaryInfo() {
        System.out.println("[BaseEntity] ID: " + id + ", Статус: " + status);
    }

    public int getId() { return id; }
    public String getStatus() { return status; }
}