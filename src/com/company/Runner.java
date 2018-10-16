package com.company;

public class Runner {

    public static void main(String[] args) {
	// write your code here
    Shape shape1 = new Rectangle(2, 3);
    System.out.println(shape1);
    System.out.println("My area is "+ shape1.getArea());
    System.out.println("My perimeter is "+shape1.getPerimeter());
    }
}
