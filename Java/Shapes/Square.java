package Shapes;

public class Square extends CommonShapes {
    private double side;
    Square(double a, String color) {
        super(color, 4);
        this.side = a;
    }

    @Override
    public double makeres() {
        return side * side;
    }

    @Override
    public double paragic() {
        return 4 * side;
    }
}
