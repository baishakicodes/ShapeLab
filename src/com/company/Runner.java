package com.company;

import candacepolisi.ETriangle;
import ryanmcgovern.Circle;

public class Runner {

    public static void main(String[] args) {
	// write your code here
    Shape shape1 = new ETriangle(2);
    System.out.println(shape1);
    System.out.println("My area is "+ shape1.getArea());
    System.out.println("My perimeter is "+shape1.getPerimeter());

    Shape shape2 = new Circle(3);
    System.out.println(shape2);
    System.out.println("My area is " + shape2.getArea());
    System.out.println("My perimeter is " + shape2.getPerimeter());
    }
}
