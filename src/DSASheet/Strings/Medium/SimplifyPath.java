package DSASheet.Strings.Medium;

import java.util.Stack;

public class SimplifyPath {
    public static void main(String[] args) {
        System.out.println("Simplify Path");
        System.out.println(simplifyPath("/home/"));
    }

    public static String simplifyPath(String path) {
        Stack<String> stk = new Stack<>();
        String currPointer = "";

        path += "/";
        for(int i = 0;i<path.length();i++){
            if(path.charAt(i) == '/'){
                if(currPointer.equals("..")){
                    if(!stk.isEmpty()) stk.pop();
                }else if(!currPointer.equals("") && !currPointer.equals(".")){
                    stk.add(currPointer);
                }
                currPointer = "";
            }else{
                currPointer += path.charAt(i);
            }
        }
        return "/"+String.join("/",stk);
    }
}
