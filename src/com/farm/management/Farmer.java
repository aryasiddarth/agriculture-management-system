package com.farm.management;

public class Farmer {
    private String name;
    private String id;

    // Constructor
    public Farmer(String name, String id) {
        this.name = name;
        this.id = id;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    // toString method to return a string representation of the Farmer object
    @Override
    public String toString() {
        return "Farmer ID: " + id + ", Name: " + name; // Adjust as necessary for your output
    }
}
