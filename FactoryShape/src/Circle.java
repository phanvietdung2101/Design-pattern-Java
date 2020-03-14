public class Circle extends Shape {
    private double radius = 1;

    @Override
    public double getArea() {
        return radius * radius * 3.14;
    }

    @Override
    public double getPerimeter() {
        return radius * 3.14;
    }
}
