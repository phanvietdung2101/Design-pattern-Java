public class Rectangle extends Shape {
    private double side1 = 1;
    private double side2 = 2;

    @Override
    public double getPerimeter() {
        return (side1 + side2) * 2;
    }

    @Override
    public double getArea() {
        return side1 * side2;
    }
}
