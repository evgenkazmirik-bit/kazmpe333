package com.meter;

public class User {
    private int id;
    private String fullName;
    private String address;
    private String phone;
    private String email;
    private String status; // ACTIVE, BLOCKED

    public User() {}

    public User(int id, String fullName, String address, String phone, String email, String status) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
        this.email = email;
        this.status = status;
    }

    public void updateContactDetails(String newPhone, String newEmail) {
        this.phone = newPhone;
        this.email = newEmail;
        System.out.println("Контакти користувача " + fullName + " оновлено.");
    }

    // Getters & Setters
    public int getId() { return id; }
    public String getFullName() { return fullName; }
    public String getAddress() { return address; }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}