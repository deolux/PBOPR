package com.example.Teori.PolymorphismTest;

public abstract class StaffMember {
    protected String name;
    protected String address;
    protected String phone;

    public StaffMember (String eName, String eAddress, String ePhone)
    {
        name = eName;
        address = eAddress;
        phone = ePhone;
    }
    @Override
    public String toString()
    {
        String result = "Name: " + name + "\n";

        result += "Address: " + address + "\n";
        result += "Phone: " + phone + "\n";

        return result;
    }

    public abstract double pay();
}
