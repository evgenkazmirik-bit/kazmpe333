package com.meter;

import java.time.LocalDateTime;

public class MeterReading {
    private int id;
    private int meterId;
    private double value;
    private LocalDateTime timestamp;
    private String status; // VALID, INVALID, PENDING

    public MeterReading() {}

    public MeterReading(int id, int meterId, double value, LocalDateTime timestamp, String status) {
        this.id = id;
        this.meterId = meterId;
        this.value = value;
        this.timestamp = timestamp;
        this.status = status;
    }

    public boolean validateReading(double previousReading) {
        if (this.value >= previousReading) {
            this.status = "VALID";
            System.out.println("Показник " + value + " є коректним.");
            return true;
        } else {
            this.status = "INVALID";
            System.out.println("Помилка: Новий показник (" + value + ") менший за попередній (" + previousReading + ")!");
            return false;
        }
    }

    // Getters & Setters
    public int getId() { return id; }
    public int getMeterId() { return meterId; }
    public double getValue() { return value; }
    public LocalDateTime getTimestamp() { return timestamp; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "MeterReading{" +
                "id=" + id +
                ", meterId=" + meterId +
                ", value=" + value +
                ", timestamp=" + timestamp +
                ", status='" + status + '\'' +
                '}';
    }
}