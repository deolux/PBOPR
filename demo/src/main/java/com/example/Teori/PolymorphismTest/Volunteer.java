package com.example.Teori.PolymorphismTest;

public class Volunteer extends StaffMember {
    
    public Volunteer (String eName, String eAddress, String ePhone)
    {
        super(eName, eAddress, ePhone);
    }
    @Override
    public double pay()
    {
        return 0;
    }
}
