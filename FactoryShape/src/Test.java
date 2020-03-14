public class Test {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape("circle");
        System.out.println(shape1.getArea());
        System.out.println(shape1.getPerimeter());

        Shape shape2 = ShapeFactory.getShape("rectangle");
        System.out.println(shape2.getArea());
        System.out.println(shape2.getPerimeter());

        Shape shape3 = ShapeFactory.getShape("square");
        System.out.println(shape3.getArea());
        System.out.println(shape3.getPerimeter());

    }
}
