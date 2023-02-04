package BitwiseOperatorAndNumberSystem;

public class UniqElement {
    public static void main(String[] args) {
        System.out.println("Unique element");
        System.out.println(uniqueElement(new int[] {1,2,3,4,1,2,3}));
    }

    static int uniqueElement(int[] nums){
        int ans = 0;
        for(int n : nums){
            ans = n ^ ans;
        }
        return ans;
    }

}
