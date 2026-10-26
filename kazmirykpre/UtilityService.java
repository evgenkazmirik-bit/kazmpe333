package com.meter;

public class UtilityService {
    private int id;
    private String name;
    private String unit; // kWh, m3
    private String description;
    private boolean active;

    public UtilityService() {}

    public UtilityService(int id, String name, String unit, String description, boolean active) {
        this.id = id;
        this.name = name;
        this.unit = unit;
        this.description = description;
        this.active = active;
    }

    public boolean isServiceActive() {
        return active;
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getName() { return name; }

    @Override
    public String toString() {
        return "UtilityService{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", unit='" + unit + '\'' +
                ", description='" + description + '\'' +
                ", active=" + active +
                '}';
    }
}