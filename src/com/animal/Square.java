package com.animal;

public class Square extends Shape{
    public Square(int a) {
        super(a);

    }

    @Override
    public int getPerimeter() {
        int p=getA()*4;
        return p;
    }
}



