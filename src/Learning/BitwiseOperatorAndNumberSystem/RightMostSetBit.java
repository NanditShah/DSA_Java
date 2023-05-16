package Learning.BitwiseOperatorAndNumberSystem;

public class RightMostSetBit {
    public static void main(String[] args) {
        System.out.println("Right most bit");
        System.out.println(rightMostBit(19));
    }

    static int rightMostBit(int number){
        int place = 1;
        while(!((number & 1) == 1)){
            number = number >> 1;
            place ++;
        }
        return place;
    }
}
