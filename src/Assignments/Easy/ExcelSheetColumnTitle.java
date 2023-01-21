package Assignments.Easy;

public class ExcelSheetColumnTitle {
    public static void main(String[] args) {
        System.out.println("Excel Sheet Column Title");
    }

    static String convertToTitle(int columnNumber) {
        String str = "";

        while(columnNumber > -1){
            char letter = (char)(columnNumber % 26 + 65);
            columnNumber = columnNumber / 26 - 1;
            str = Character.toString(letter) + str;
        }

        return str;
    }
}
