package Learning.OOP.Inheritance;

public class Box {
    double l;
    double h;
    double w;

    public Box() {
        this.l = -1;
        this.h = -1;
        this.w = -1;
    }
    public Box(double l, double h, double w) {
        this.l = l;
        this.h = h;
        this.w = w;
    }

    public Box(double side) {
        this.l = side;
        this.h = side;
        this.w = side;
    }

    public Box(Box oldBox) {
        this.l = oldBox.l;
        this.h = oldBox.h;
        this.w = oldBox.w;
    }
}
