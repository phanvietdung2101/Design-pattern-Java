public class Square extends Shape {
    private double side = 1;

    @Override
    public double getPerimeter() {
        return side * 2;
    }

    @Override
    public double getArea() {
        return side * side;
    }
}
