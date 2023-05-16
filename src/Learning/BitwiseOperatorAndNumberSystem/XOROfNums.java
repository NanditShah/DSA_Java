package Learning.BitwiseOperatorAndNumberSystem;

import java.util.ArrayList;

public class XOROfNums {
    public static void main(String[] args) {
        System.out.println("XOR of 0 to A");
    }

    static ArrayList<Integer> getXOR(int a){
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 1;i<=a;i++){
            if(i %4 == 0){
                ans.add(i);
            }else if(i %4 == 1){
                ans.add(1);
            }else if(i % 4 == 2){
                ans.add(i+1);
            }else{
                ans.add(0);
            }
        }
        return ans;
    }


//    XOR of 1 = 1;
//    XOR of 2 = 1 ^ 2;
//    XOR of 3 = 1 ^ 2 ^ 3;
//    XOR of 4 = 1 ^ 2 ^ 3 ^ 4;
}
