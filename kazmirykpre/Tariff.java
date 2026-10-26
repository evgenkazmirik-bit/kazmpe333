package com.meter;

public class Tariff {
    private int id;
    private int serviceId;
    private double pricePerUnit;
    private String status; // ACTIVE, OUTDATED

    public Tariff() {}

    public Tariff(int id, int serviceId, double pricePerUnit, String status) {
        this.id = id;
        this.serviceId = serviceId;
        this.pricePerUnit = pricePerUnit;
        this.status = status;
    }

    public double calculateCost(double unitsConsumed) {
        double totalCost = unitsConsumed * pricePerUnit;
        System.out.println("Розрахунок вартості: " + unitsConsumed + " од. * " + pricePerUnit + " грн = " + totalCost + " грн");
        return totalCost;
    }

    // Getters & Setters
    public double getPricePerUnit() { return pricePerUnit; }

    @Override
    public String toString() {
        return "Tariff{" +
                "id=" + id +
                ", serviceId=" + serviceId +
                ", pricePerUnit=" + pricePerUnit +
                ", status='" + status + '\'' +
                '}';
    }
}