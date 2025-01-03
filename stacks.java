import java.util.Stack;

public class stacks {
    public static void main(String[] args) {
        Stack<String> stack = new Stack<>();
        stack.push("India");
        stack.push("America");
        stack.push("Russia");
        stack.push("China");
        System.out.println("stack -"+stack);
        String s=stack.pop();
        System.out.println(s);
        System.out.println(stack.peek());
    }
}
