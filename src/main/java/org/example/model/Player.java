package org.example.model;

import java.util.Date;

public class Player {
    private int id;
    private String name;
    private String dob;
    private String experience;
    private String position;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Player() {
    }

    public Player(int id, String name, String dob, String experience, String position) {
        this.id = id;
        this.name = name;
        this.dob = dob;
        this.experience = experience;
        this.position = position;
    }
}