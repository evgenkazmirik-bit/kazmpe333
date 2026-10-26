package com.meter;

public class CommercialUser extends User {
    private String companyName;
    private String edrpouCode;

    public CommercialUser(int id, String status, String fullName, String address, String phone, String companyName, String edrpouCode) {
        super(id, status, fullName, address, phone);
        this.companyName = companyName;
        this.edrpouCode = edrpouCode;
    }

    // 3-й Перевизначений метод
    @Override
    public void displaySummaryInfo() {
        System.out.println("[CommercialUser] Юридична особа: " + companyName + " (ЄДРПОУ: " + edrpouCode + "), Представник: " + fullName);
    }

    @Override
    public String toString() {
        return "CommercialUser{" + "companyName='" + companyName + '\'' + ", edrpou='" + edrpouCode + '\'' + ", rep='" + fullName + '\'' + '}';
    }
}