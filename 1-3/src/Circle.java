
public class Circle extends Graphic{

    private double r;

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }

    @Override
    public double getArea() {
        return Math.PI*r*r;
    }
}
