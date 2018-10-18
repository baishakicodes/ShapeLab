package candacepolisi;
import com.company.Shape;
public class Ellipse extends Shape{
    private int bigrad;
    private int smallrad;

    public Ellipse(int bigrad, int smallrad){
        super("Ellipse");
        this.bigrad= bigrad;
        this.smallrad= smallrad;
    }
    public double getArea() {
        return Math.PI * bigrad * smallrad;
    }

    public double getPerimeter () {
        double a= bigrad*bigrad + smallrad*smallrad;
        a= a/2;
        a= Math.sqrt(a);
        a= a * 2 * Math.PI;
        return a;
    }
}
