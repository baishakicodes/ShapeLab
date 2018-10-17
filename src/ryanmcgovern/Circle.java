package ryanmcgovern;
import com.company.Shape;

    public class Circle extends Shape {
        private int radius;

        public Circle(int radius){
            super("Circle");
            this.radius=radius;
        }

        @Override
        public double getArea() {
            return Math.PI * radius* radius;
        }

        @Override
        public double getPerimeter() {
            return Math.PI * (radius * 2);
        }
    }
}
