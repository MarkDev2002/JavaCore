package TestCollections;

import java.util.Stack;

public class TestStack {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();

        stack.push("America");
        stack.push("Germany");
        stack.push("India");

        System.out.println("Stack : " + stack);

        String popedElement = stack.pop(); //xóa phần tử cuối cùng ra khỏi stack
        System.out.println("Popped Element : " + popedElement);

        System.out.println("Now the stack looks like : " + stack);

        System.out.println("First element : " + stack.peek()); // trả về phần tử kế cuối
    }
}
