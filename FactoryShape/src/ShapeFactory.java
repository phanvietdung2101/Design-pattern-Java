public class ShapeFactory {
    private ShapeFactory() {
    }

    public static Shape getShape(String shapeType){
        if(shapeType.equals("circle")){
            return new Circle();
        } else if(shapeType.equals("rectangle")){
            return new Rectangle();
        } else if(shapeType.equals("square"))
            return new Square();
        else
            return null;
    }
}
