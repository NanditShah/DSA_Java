package DSASheet.Strings.Medium;

public class ZigzagConversion {
    public static void main(String[] args) {
        System.out.println("Zigzag Conversion");

        String zigzagStr = convert("PAYPALISHIRING",3);
        System.out.println(zigzagStr);
        System.out.println(zigzagStr.equals("PAHNAPLSIIGYIR"));
    }

    public static String convert(String s, int numRows) {
        String[] strs = new String[numRows];

        for(int j = 0;j<numRows;j++){
            strs[j] = "";
        }

        int direction = numRows == 1 ? 0 : -1;
        int i = 0;
        int arrIterator = 0;
        while(i < s.length()){
            strs[arrIterator] += s.charAt(i);
            if (arrIterator == 0 || arrIterator == numRows - 1) {
                direction *= -1;
            }
            arrIterator += direction;
            i++;
        }

        String ans = "";
        for(String str : strs){
            ans += str;
        }
        return ans;
    }
}
