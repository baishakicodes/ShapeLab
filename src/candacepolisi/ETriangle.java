package candacepolisi;

import com.company.Shape;

public class ETriangle extends Shape {
    private int side;

    public ETriangle(int side){
        super("ETriangle");
        this.side= side;
    }

    public double getArea() {
        double h= Math.sqrt(3) * side;
        double a= .5 * h * side;
        return a;
    }

    public double getPerimeter(){
        return (3*side);
    }
}

