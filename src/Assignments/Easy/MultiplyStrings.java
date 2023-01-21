package Assignments.Easy;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println("Multiply Strings");
    }

    // Not resolved
    public String multiply(String num1, String num2) {
        long long1 = Long.parseLong(num1);
        long long2 = Long.parseLong(num2);

        long ans = long1 * long2;
        return Long.toString(ans);
    }
}
