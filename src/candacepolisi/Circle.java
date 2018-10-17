package candacepolisi;
import com.company.Shape;
public class Circle {
    public class Circle extends Shape {
        private int radius;

        public Circle(int radius){
            super("Circle");
            this.radius=radius;
        }

        public double getArea() {
            return Math.PI * radius* radius;
        }
        public double getPerimeter() {

        }
    }
}
