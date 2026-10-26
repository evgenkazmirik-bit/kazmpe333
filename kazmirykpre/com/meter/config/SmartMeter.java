package com.meter;

public class SmartMeter extends Meter {
    private String ipAddress;
    private boolean autoSendEnabled;

    public SmartMeter(int id, String status, String serialNumber, String resourceType, String location, String ipAddress, boolean autoSendEnabled) {
        super(id, status, serialNumber, resourceType, location);
        this.ipAddress = ipAddress;
        this.autoSendEnabled = autoSendEnabled;
    }

    // 2-й Перевизначений метод
    @Override
    public void displaySummaryInfo() {
        System.out.println("[SmartMeter] Smart-лічильник №" + serialNumber + " | IP: " + ipAddress + " | Автопередача: " + autoSendEnabled);
    }

    public void sendDataAutomatically(double currentValue) {
        if (autoSendEnabled && "ACTIVE".equalsIgnoreCase(status)) {
            System.out.println("[SmartMeter] Автоматичне відправлення показника " + currentValue + " через IP " + ipAddress);
        } else {
            System.out.println("[SmartMeter] Автопередача неактивна.");
        }
    }

    @Override
    public String toString() {
        return "SmartMeter{" + "serialNumber='" + serialNumber + '\'' + ", ipAddress='" + ipAddress + '\'' + ", autoSend=" + autoSendEnabled + '}';
    }
}