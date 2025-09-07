package stack;

public class Main {
    public static void main(String[] args) {
        MyStack myStack = new MyStack();

        myStack.push(10);
        myStack.push(20);
        myStack.push(30);
        myStack.push(40);
        myStack.push(50);

        while (!myStack.isEmpty()){
            System.out.println(myStack.pop());
        }
    }
}
