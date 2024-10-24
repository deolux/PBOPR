package com.example.Pertemuan8.StudiKasus1;

public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember(String eName, String eAddress, String ePhone) {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    @Override
    public String toString() {
        return "Name: " + name + "\nAddress: " + address + "\nPhone: " + phone;
    }

    public abstract double pay();
}

