package com.meter;

public class Meter {
    private int id;
    private String serialNumber;
    private String resourceType; // WATER, ELECTRICITY, GAS
    private String location;
    private String status; // ACTIVE, INACTIVE, MAINTENANCE

    public Meter() {}

    public Meter(int id, String serialNumber, String resourceType, String location, String status) {
        this.id = id;
        this.serialNumber = serialNumber;
        this.resourceType = resourceType;
        this.location = location;
        this.status = status;
    }

    public void toggleStatus() {
        if ("ACTIVE".equalsIgnoreCase(this.status)) {
            this.status = "INACTIVE";
        } else {
            this.status = "ACTIVE";
        }
        System.out.println("Статус лічильника " + serialNumber + " змінено на: " + this.status);
    }

    public void updateLocation(String newLocation) {
        this.location = newLocation;
        System.out.println("Локацію лічильника " + serialNumber + " оновлено на: " + newLocation);
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getSerialNumber() { return serialNumber; }
    public String getResourceType() { return resourceType; }
    public String getLocation() { return location; }
    public String getStatus() { return status; }

    @Override
    public String toString() {
        return "Meter{" +
                "id=" + id +
                ", serialNumber='" + serialNumber + '\'' +
                ", resourceType='" + resourceType + '\'' +
                ", location='" + location + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}