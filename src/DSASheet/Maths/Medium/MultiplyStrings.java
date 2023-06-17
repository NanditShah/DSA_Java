package DSASheet.Maths.Medium;

public class MultiplyStrings {
    public static void main(String[] args) {
        System.out.println("Multiply Strings");
        System.out.println(multiply("123","456"));
    }

    public static String multiply(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();

        String ans = "";

        int[] pos = new int[m+n];

        for(int i = m - 1;i>=0;i--){
            for(int j = n - 1;j>=0;j--){
                int sum = ((num1.charAt(i) - '0') * (num2.charAt(j) - '0')) + pos[i+j+1];
                pos[i+j] += sum / 10;
                pos[i+j+1] = sum % 10;
            }
        }

        for(int p : pos){
            if(p > 0 || ans.length() > 0){
                ans += (p+"");
            }
        }
        return ans.length() > 0 ? ans : "0";
    }
}
