package Assignments.Easy;

public class NumberComplement {
    public static void main(String[] args) {
        System.out.println("Number Complement");
        System.out.println(findComplement(1));
    }

    static int findComplement(int num) {
        for (long i = 1; i <= num; i <<= 1)
            num ^= i;
        return num;
    }
}
