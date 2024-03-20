package ch15.lecture.p3stack;

import java.util.Stack;

public class C01Stack {
    public static void main(String[] args) {
        Stack<String> stack=new Stack<>();
        stack.push("java");
        stack.push("react");
        stack.push("spring");
        stack.push("css");

        System.out.println(stack.size());

        String s1=stack.pop();
        System.out.println(s1);
        String s2=stack.pop();
        System.out.println(s2);
        String s3=stack.pop();
        System.out.println(s3);
        String s4=stack.pop();
        System.out.println(s4);

        System.out.println(stack.size());

    }
}
