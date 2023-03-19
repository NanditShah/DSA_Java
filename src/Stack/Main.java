package Stack;

public class Main {
    public static void main(String[] args) throws StackException{
//        StaticStack staticStack = new StaticStack(5);
//
//        staticStack.push(5);
//        staticStack.push(10);
//        staticStack.push(15);
//        staticStack.push(20);
//        staticStack.push(25);
//
//        System.out.println(staticStack.pop());
//        System.out.println(staticStack.pop());
//        System.out.println(staticStack.pop());
//        System.out.println(staticStack.pop());
//        System.out.println(staticStack.pop());


        DynamicStack dynamicStack = new DynamicStack(5);

        dynamicStack.push(5);
        dynamicStack.push(10);
        dynamicStack.push(15);
        dynamicStack.push(20);
        dynamicStack.push(25);
        dynamicStack.push(22);

        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());
        System.out.println(dynamicStack.pop());

    }
}
