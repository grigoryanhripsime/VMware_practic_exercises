package Shapes;
import java.lang.Math;

public class Circle extends CommonShapes {
    private double r;
    Circle(double r, String color) {
        super(color, 0);
        this.r = r;

    }

    @Override
    public double makeres() {
        return 3.14 * Math.pow(r, 2) / 2;
    }

    @Override
    public double paragic() {
        return 2 * 3.14 * r;
    }
}
