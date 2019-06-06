package com.bekov.main_student.model;

public class Student {
    private String fullName;
    private double ratings;

    public Student(String fullName, double ratings) {
        this.fullName = fullName;
        this.ratings = ratings;
    }

    public Student() {
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public double getRatings() {
        return ratings;
    }

    public void setRatings(double ratings) {
        this.ratings = ratings;
    }
}
