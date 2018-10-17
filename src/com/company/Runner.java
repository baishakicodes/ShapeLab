package com.company;

import candacepolisi.ETriangle;
import ryanmcgovern.Circle;

public class Runner {

    public static void main(String[] args) {
	// write your code here
    Shape shape1 = new ETriangle(2);
    Shape shape2 = new Circle(3);
    Shape shape3 = new Rectangle(3,2);

    Shape shape4 = new RPentagon(5);
    System.out.println(shape4);
    System.out.println("My perimeter is: "+shape4.getPerimeter());
    System.out.println("My area is: "+shape4.getArea());

    Shape[] shapes = {shape1, shape2, shape3};
    for (Shape cur : shapes){
        System.out.println(cur);
        System.out.println("My area is: "+cur.getArea());
        System.out.println("My perimeter is: "+cur.getPerimeter())
    }

    }
}
