public class Square extends Graphic{
    private double x;

    @Override
    public double getPerimeter() {
        return 4*x;
    }

    @Override
    public double getArea() {
        return x*x;
    }

}
