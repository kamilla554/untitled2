package com.company;

public class Shape {
    int a;
    int b;

    public Shape(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "a=" + a +
                ", b=" + b +
                '}';
    }
}
