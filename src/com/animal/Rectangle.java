package com.animal;

public class Rectangle extends Shape{
    int b;

    public Rectangle(int a, int b) {
        super(a);
        this.b=b;
    }

    @Override
    public int getPerimeter() {
        int p4=(getA()*2)+(b*2);
        return p4;
    }
}
