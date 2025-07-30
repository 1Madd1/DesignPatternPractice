package org.example.strategy_pattern;

public class User {
    private String name;

    public User(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printJobComplete(Job j) {
        System.out.println("User " + name + ": Job " + j.getId() + " is complete");
    }
}
