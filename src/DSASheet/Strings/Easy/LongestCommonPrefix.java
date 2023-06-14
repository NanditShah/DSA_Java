package DSASheet.Strings.Easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        System.out.println("Longest Common Prefix");
    }

    public String longestCommonPrefix(String[] strs) {
      StringBuilder lcp = new StringBuilder();

      int minimumLength = strs[0].length();

      for(int i =1;i<strs.length;i++){
          minimumLength = Math.min(minimumLength,strs[i].length());
      }

      for(int i =0;i<minimumLength;i++){
          char currentChar = strs[0].charAt(i);

          for(String str : strs){
              if(str.charAt(i) != currentChar){
                  return lcp.toString();
              }
          }
          lcp.append(currentChar);
      }
      return lcp.toString();
    }
}
