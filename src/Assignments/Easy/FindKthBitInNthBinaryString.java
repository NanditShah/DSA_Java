package Assignments.Easy;

public class FindKthBitInNthBinaryString {
    public static void main(String[] args) {
        System.out.println("Find Kth Bit in Nth Binary String");
        System.out.println(findKthBit(3, 1));
    }


        static char findKthBit (int n,int k){
            String str = ith(n);

            return str.charAt(k - 1);
        }

        static String ith ( int n){
            if (n == 1) {
                return "0";
            }

            String str = ith(n - 1);

            return str + "1" + reverse(invert(str));
        }

        static String reverse (String str){
            StringBuilder sb = new StringBuilder();

            sb.append(str);

            return sb.reverse().toString();
        }

        static String invert (String str){
            StringBuilder sb = new StringBuilder();

            sb.append(str);

            for (int i = 0; i < sb.length(); i++) {
                if (sb.charAt(i) == '0') {
                    sb.setCharAt(i, '1');
                } else {
                    sb.setCharAt(i, '0');
                }
            }

            return sb.toString();
        }
    }

