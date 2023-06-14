package DSASheet.Strings.Easy;

public class AddStrings {
    public static void main(String[] args) {
        System.out.println("Add Strings");
        String sum = addStrings("6913259244","71103343");
        System.out.println(sum);
    }

    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int carry = 0;
        int n1 = num1.length() - 1;
        int n2 = num2.length() - 1;

        while(n1 >= 0 || n2 >= 0 || carry > 0){
            if(n1 >= 0){
                carry += num1.charAt(n1) - '0';
                n1 --;
            }
            if(n2 >= 0){
                carry += num2.charAt(n2) - '0';
                n2 --;
            }
            sb.append(carry % 10);
            carry /= 10;
        }

        return sb.reverse().toString();
    }

}
