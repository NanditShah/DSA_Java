package Learning.OOP.Inheritance;

public class BoxWeight extends Box{

    double weight;

    public BoxWeight(double weight) {
        super();
        this.weight = weight;
    }

    public BoxWeight(double l, double h, double w, double weight) {
        super(l, h, w);
        this.weight = weight;
    }

    public BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }

    public BoxWeight(Box oldBox, double weight) {
        super(oldBox);
        this.weight = weight;
    }
}
