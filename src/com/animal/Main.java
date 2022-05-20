package com.animal;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       /* publicabstract double getPerimeter()
        абстракт методун  Shape деген класска кошунуз.

        Ал методту ишке ашырган 5 мурастоочу класс тузунуз жана методту ишке ашырыныз.



                Добавьте абстрактный метод

        public abstract double getPerimeter()
        в класс Shape. Реализуйте этот метод в 5 классах наследниках класса Shape.

        */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        Square square = new Square(a);
        System.out.println(square.getPerimeter());


        int a1 = sc.nextInt();
        int b1 = sc.nextInt();
        int c1 = sc.nextInt();
        Triangle triangle = new Triangle(a1, b1, c1);
        System.out.println(triangle.getPerimeter());

        int a2 = sc.nextInt();
        Cube cube = new Cube(a2);
        System.out.println(cube.getPerimeter());

        int a3 = sc.nextInt();
        int b3 = sc.nextInt();
        Rectangle rectangle = new Rectangle(a3, b3);
        System.out.println(rectangle.getPerimeter());

        int a4 = sc.nextInt();
        Rhombus rhombus = new Rhombus(a4);
        System.out.println(rhombus.getPerimeter());


    }
}