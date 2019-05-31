package com.kodilla.testing.shape;

public class Circle implements Shape {
    double radius;
    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public String getShapeName() {
    return "Circle";
    }

    @Override
    public double getFiled() {
        return radius*radius*3.14;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Circle circle = (Circle) o;

        return Double.compare(circle.radius, radius) == 0;

    }

    @Override
    public int hashCode() {
        long temp = Double.doubleToLongBits(radius);
        return (int) (temp ^ (temp >>> 32));
    }
}