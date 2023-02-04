package Assignments.Easy;

public class XOROperationInAnArray {
    public static void main(String[] args) {
        System.out.println("XOR Operation in an Array");
        System.out.println(xorOperation(4,3));
    }

    static int xorOperation(int n,int start){
        int ans=0;
        int i = 0;
        while(i<n){
                int num = start+2*i;
            ans ^= num;
            i++;
        }
        return ans;
    }
}
