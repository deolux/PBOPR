package com.example.ETS;

public class status {
    private int code;
    private String description;

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }
    
    public status(int code, String description) {
        this.code = code;
        this.description = description;
    }
}
