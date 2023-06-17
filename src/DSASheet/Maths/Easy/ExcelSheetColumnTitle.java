package DSASheet.Maths.Easy;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println("Excel Sheet Column Title");
        System.out.println(convertToTitle(28));
    }

    public static String convertToTitle(int columnNumber) {
        String str = "";

        columnNumber -= 1;
        while(columnNumber > -1){
            char ch = (char) ((columnNumber % 26) + 65);
            columnNumber = (columnNumber / 26) - 1;
            str = (ch + "")+str;
        }
        return str;
    }
}
