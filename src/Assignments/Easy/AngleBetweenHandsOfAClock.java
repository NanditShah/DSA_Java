package Assignments.Easy;

public class AngleBetweenHandsOfAClock {
    public static void main(String[] args) {
        System.out.println("Angle Between Hands of a Clock");
        angleClock(3,15);
    }

    static double angleClock(int hour, int minutes) {
        double firstTerm = minutes*(5.5);
        double secondTerm = 30*hour;
        double angle = Math.abs(firstTerm - secondTerm);
        if(angle > 180){
            angle = 360 - angle;
        }
        return angle;
    }
}
