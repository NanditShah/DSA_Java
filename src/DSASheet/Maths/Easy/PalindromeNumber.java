package DSASheet.Maths.Easy;

public class PalindromeNumber {
    public static void main(String[] args) {
        System.out.println("Palindrome Number");

        System.out.println(isPalindrome(10));
    Integer.
    }

    public static boolean isPalindrome(int x) {
        String num = x+"";
        int left = 0,right = num.length()-1;

        while(left < right){
            if(num.charAt(left) != num.charAt(right)) return false;
            left++;
            right--;
        }
        return true;
    }
}
