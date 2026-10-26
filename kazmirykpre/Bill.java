package com.meter;

public class Bill {
    private int id;
    private int userId;
    private String period;
    private double amountDue;
    private String status; // UNPAID, PAID, OVERDUE

    public Bill() {}

    public Bill(int id, int userId, String period, double amountDue, String status) {
        this.id = id;
        this.userId = userId;
        this.period = period;
        this.amountDue = amountDue;
        this.status = status;
    }

    public void markAsPaid() {
        this.status = "PAID";
        System.out.println("Рахунок #" + id + " успішно сплачено!");
    }

    public void markAsOverdue() {
        this.status = "OVERDUE";
        System.out.println("Увага: Рахунок #" + id + " прострочено!");
    }

    // Getters & Setters
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Bill{" +
                "id=" + id +
                ", userId=" + userId +
                ", period='" + period + '\'' +
                ", amountDue=" + amountDue +
                ", status='" + status + '\'' +
                '}';
    }
}