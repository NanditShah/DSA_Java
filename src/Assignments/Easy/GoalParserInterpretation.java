package Assignments.Easy;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        System.out.println("Goal Parser Interpretation");
        String c = "(al)G(al)()()G";
        System.out.println(interpret(c));
    }
    static String interpret(String command) {

        String newStr = command.replace("()","o");
        String ans = newStr.replace("(al)","al");
        return ans;
    }
}
