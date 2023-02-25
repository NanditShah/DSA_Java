package OOP.Inheritance;

public class Main {
    public static void main(String[] args) {
        System.out.println("Example of Inheritance and it's multiple properties");

        Box b1 = new Box();
        Box b2 = new Box(1.0,2.0,3.0);
        Box b3 = new Box(2.0);
        Box b4 = new Box(b2);

        System.out.println(b1.l+" "+b1.w+" "+b1.h);
        System.out.println(b2.l+" "+b2.w+" "+b2.h);
        System.out.println(b3.l+" "+b3.w+" "+b3.h);
        System.out.println(b4.l+" "+b4.w+" "+b4.h);

        BoxWeight bw1 = new BoxWeight(5.0);
        BoxWeight bw2 = new BoxWeight(1.0,2.0,3.0,5.0);
        BoxWeight bw3 = new BoxWeight(b3,5.0);

        System.out.println(bw1.l+" "+bw1.w+" "+bw1.h+" "+bw1.weight);
        System.out.println(bw2.l+" "+bw2.w+" "+bw2.h+" "+bw2.weight);
        System.out.println(bw3.l+" "+bw3.w+" "+bw3.h+" "+bw3.weight);

    }
}
