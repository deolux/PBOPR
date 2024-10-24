package com.example.Pertemuan8.StudiKasus2;

abstract public class Shape {
    protected String shapeName;
    
    public Shape(String shapeName)
    {
        this.shapeName = shapeName;
    }

    public abstract double area();

    @Override
    public String toString()
    {
        return "Shape = " + shapeName;
    }
}
