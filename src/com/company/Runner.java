package com.company;

import candacepolisi.ETriangle;
import candacepolisi.Ellipse;
import candacepolisi.Triangle;
import ryanmcgovern.Circle;

public class Runner {

    public static void main(String[] args) {
	// write your code here
    Shape shape1 = new ETriangle(2);
    Shape shape2 = new Circle(3);
    Shape shape3 = new Rectangle(3,2);
    Shape shape5= new Triangle(2,3,3);
    Shape shape6= new Ellipse(3,2);
    Shape shape4 = new RPentagon(5);

    Shape[] shapes = {shape1, shape2, shape3, shape4, shape5, shape6};
    for (Shape cur : shapes){
        System.out.println(cur);
        System.out.println("My area is: "+cur.getArea());
        System.out.println("My perimeter is: "+cur.getPerimeter());
    }

    }
}
