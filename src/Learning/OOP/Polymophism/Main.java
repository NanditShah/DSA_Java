package Learning.OOP.Polymophism;

public class Main {
    public static void main(String[] args) {
        Shapes shape = new Shapes();
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        shape.area();
        circle.area();
        square.area();
        triangle.area();





//        There are two types of polymorphism
//        1. Run time
//        2. Compile time

//        final methods can not be override
//        final keyword is also used to define create Constants
//        final class can not be inherited
//        static methods can not be override


//        Encaptulation is mostly used for Data hiding, and for hiding inner implementation
//        For accessing internal data if required getters and setters are defined.



//        Abstraction is more about hiding unneccesary information or implementation from user
//        For example how car is working or car's inner structure is not important so abstracting it from the real-world user is right example to understand.


//        Access Modifiers
//        1. Private - Can only be used in same file (Getters and setters can be created for accessing private variables)
//        2. Public - Can be used everywhere
//        3. Default (No access modifiers) - Can be used in same package and not in subclass of different packages
//        4. Protected - Can be used in same package and subclass of other packages as well
    }
}
