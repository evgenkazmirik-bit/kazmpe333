package com.meter;

public class Meter extends BaseEntity {
    protected String serialNumber;
    protected String resourceType;
    protected String location;

    public Meter() {}

    public Meter(int id, String status, String serialNumber, String resourceType, String location) {
        super(id, status);
        this.serialNumber = serialNumber;
        this.resourceType = resourceType;
        this.location = location;
    }

    // 1-й Перевизначений метод з BaseEntity
    @Override
    public void displaySummaryInfo() {
        System.out.println("[Meter] Лічильник №" + serialNumber + " (" + resourceType + "), Статус: " + status);
    }

    public void toggleStatus() {
        this.status = "ACTIVE".equalsIgnoreCase(this.status) ? "INACTIVE" : "ACTIVE";
        System.out.println("Статус лічильника " + serialNumber + " змінено на: " + this.status);
    }

    public String getSerialNumber() { return serialNumber; }

    @Override
    public String toString() {
        return "Meter{" + "id=" + id + ", status='" + status + '\'' +
                ", serialNumber='" + serialNumber + '\'' + ", resourceType='" + resourceType + '\'' + '}';
    }
}