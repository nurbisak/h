package com.animal;

public class Triangle extends Shape{
private int b;
private int c;

    public Triangle(int a,int b ,int c) {
        super(a);
        this.b=b;
        this.c =c;
    }

    @Override
    public int getPerimeter() {
        int p1=getA()+b+c;
        return p1;
    }
}

