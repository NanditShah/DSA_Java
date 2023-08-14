package DSASheet.Stack.Medium;

import java.util.Stack;

public class OnlineStockSpan {
    public static void main(String[] args) {
        System.out.println("Online Stock Span");
    }

    class StockSpanner {
        Stack<int[]> s;

        public StockSpanner() {
            s = new Stack<>();
        }
        public int next(int price) {
            int span=1;
            while(!s.isEmpty() && price>=s.peek()[0]){
                span+=s.peek()[1];
                s.pop();
            }
            s.push(new int[]{price,span});
            return span;
        }
    }
}
