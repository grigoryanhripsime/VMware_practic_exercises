package Shapes;
public abstract class CommonShapes implements Shape {
    private final String color;
    private final int numOfSides;

    public int getNumOfSides() {
        return numOfSides;
    }

    public CommonShapes(String color, int numOfSides) {
        this.color = color;
        this.numOfSides = numOfSides;
    }


    public boolean hasSides() {
        if (getNumOfSides() > 0)
            return true;
        return false;
    }

    @Override
    public String toString() {
        return "Sides of this shape: " + this.getNumOfSides() + "\n" +
                "Color of this shape: " + this.color;
    }
}
