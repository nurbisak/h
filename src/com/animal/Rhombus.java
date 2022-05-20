package com.animal;

public class Rhombus extends Shape{

    public Rhombus(int a) {
        super(a);
    }

    @Override
    public int getPerimeter() {
        int p5=getA()*4;
        return p5;
    }
}

