public class RectangleDemo {
    public static void main(String[] args) {
        Pointer point = new Pointer(1, 2);
        Rectangle rect = new Rectangle(point, 5, 7);
        System.out.println("Paragic = " + rect.paragic());
        System.out.println("Makeres = " + rect.makeres());
        Rectangle rect2 = new Rectangle(rect);
        Rectangle rect3 = rect;
        rect2.setHeight(10);
        rect3.setHeight(20);
        System.out.println(rect);
        System.out.println(rect2);
        System.out.println(rect3);
    }
}

class Pointer {
    public int x;
    public int y;

    Pointer (int x, int y) {
        this.x = x;
        this.y = y;
    }
    void setx (int x) {
        this.x = x;
    }
    void sety (int y) {
        this.y = y;
    }

    int getx () {
        return this.x;
    }
    int gety () {
        return this.y;
    }

    Pointer (Pointer that) {
        this.x = that.x;
        this.y = that.y;
    }
}


class Rectangle {
    Pointer p;
    int height, width;
    Rectangle (Pointer p, int height, int width) {
        this.p = p;
        this.height = height;
        this.width = width;
    }
    Rectangle (Rectangle that) {
        this.p = that.p;
        this.width = that.width;
        this.height = that.height;
    }

    void setp (Pointer p) {
        this.p = p;
    }

    Pointer getp () {
        return this.p;
    }

    void setWidth (int w) {
        this.width = w;
    }
    int getWidth () {
        return this.width;
    }

    void setHeight (int h) {
        this.height = h;
    }
    int getHeight () {
        return this.height;
    }

    int paragic () {
        return 2 * (getWidth() + getHeight());
    }

    int makeres () {
        return getHeight() * getWidth();
    }

    public String toString () {
        return "Rectangle { corner = (" + getp().x + ", " + getp().y + "), width = " + getWidth() + ", height = " + getHeight() + " }";
    }
}
