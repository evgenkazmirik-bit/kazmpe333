package com.meter;

public class User extends BaseEntity {
    protected String fullName;
    protected String address;
    protected String phone;

    public User(int id, String status, String fullName, String address, String phone) {
        super(id, status);
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
    }

    public String getFullName() { return fullName; }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", fullName='" + fullName + '\'' + ", status='" + status + '\'' + '}';
    }
}