package candacepolisi;
import com.company.Shape;

public class Triangle extends Shape {
    private int side1;
    private int side2;
    private int side3;

    public Triangle(int side1, int side2, int side3){
        super("Triangle");
        this.side1= side1;
        this.side2= side2;
        this.side3= side3;
    }

    public double getArea() {
        double s= (side1+ side2+ side3)/2;
        double a= s*(s-side1)*(s-side2)*(s-side3);
        a= Math.sqrt(a);
        return a;
    }
    public double getPerimeter() {
        return side1 + side2+ side3;
    }

}
