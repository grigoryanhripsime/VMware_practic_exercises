package Shapes;

public class ShapesDemo {
    public static void main(String[] args) {
        CommonShapes shape1 = new Rectangle(3, 4, "Red");
        CommonShapes shape2 = new Square(5, "Green");
        CommonShapes shape3 = new Circle(10, "Blue");


        System.out.println("Rectangle\n" + shape1);
        System.out.println("Square\n" + shape2);
        System.out.println("Circle\n" + shape3);

    }
}
