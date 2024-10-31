package com.example.Pertemuan10;

public class Passenger {
    private String name;
    private Boolean vip;

    public Passenger(String name, boolean vip)
    {
        this.name = name;
        this.vip = vip;
    }

    public String getName() {
        return name;
    }

    public Boolean isVip() {
        return vip;
    }
}
