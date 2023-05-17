package Shapes;

public class Rectangle extends CommonShapes {

    private double side1, side2;
    public Rectangle(double a, double b, String color) {
        super(color, 4);
        this.side1 = a;
        this.side2 = b;
    }

    @Override
    public double makeres() {;
        return  this.side1 * this.side2;
    }

    @Override
    public double paragic() {
        return 2 * (side1 + side2);
    }

    @Override
    public boolean hasSides() {
        if (getNumOfSides() > 0)
            return true;
        return false;
    }
}
