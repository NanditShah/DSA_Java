package DSASheet.Stack.Medium;

import java.util.Iterator;
import java.util.Stack;

public class FlattenNestedListIterator {
    public static void main(String[] args) {
        System.out.println("Flatten Nested List Iterator");
    }

//    Commented out because the NestedInteger class is not avail in my code and it is giving error

    
//    public class NestedIterator implements Iterator<Integer> {
//
//        Stack<NestedInteger> stack = new Stack<NestedInteger>();
//        public NestedIterator(List<NestedInteger> nestedList) {
//            prepareStack(nestedList);
//        }
//
//        @Override
//        public Integer next() {
//            if (!hasNext()) {
//                return null;
//            }
//            return stack.pop().getInteger();
//        }
//
//        @Override
//        public boolean hasNext() {
//            while (!stack.isEmpty() && !stack.peek().isInteger()) {
//                List<NestedInteger> list = stack.pop().getList();
//                prepareStack(list);
//            }
//            return !stack.isEmpty();
//        }
//
//        private void prepareStack(List<NestedInteger> nestedList) {
//            for (int i = nestedList.size() - 1; i >= 0; i--) {
//                stack.push(nestedList.get(i));
//            }
//        }
//    }
}
