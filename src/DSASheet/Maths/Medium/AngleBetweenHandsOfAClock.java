package DSASheet.Maths.Medium;

public class AngleBetweenHandsOfAClock {
    public static void main(String[] args) {
        System.out.println("Angle Between Hands of a Clock");

        double angle = angleClock(3,30);
        System.out.println(angle);
    }

    public static double angleClock(int hour, int minutes) {
        double hourAngle = ((hour%12)*30) + ((double) minutes*0.5);
        double minutesAngle = minutes * 6;

        double angle = Math.abs(hourAngle - minutesAngle);
        return angle > 180 ? 360 - angle : angle;
    }
}
