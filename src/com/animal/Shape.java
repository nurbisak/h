package com.animal;

public abstract class Shape {
    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public Shape(int a) {
        this.a = a;

    }

    private int a;
    public abstract int getPerimeter();

}
