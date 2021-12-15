package com.company;

public class Circles extends Shape {
    private double radius = 1.0;

    public Circles() {
    }

    public Circles(double radius) {
        this.radius = radius;
    }

    public Circles(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return Math.PI * radius * 2;
    }

    @Override
    public String toString() {
        return "A Circle with radius = " + radius +
                ", which is a subclass of " +
                super.toString();
    }
}

