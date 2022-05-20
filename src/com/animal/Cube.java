package com.animal;

public class Cube extends Shape{


    public Cube(int a) {
        super(a);
    }

    @Override
    public int getPerimeter() {
        int p3=getA()*12;
        return p3;
    }
}
