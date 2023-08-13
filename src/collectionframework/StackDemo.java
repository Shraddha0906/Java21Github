package collectionframework;

import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer>stack=new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println(stack.pop());   //remove last element   -because stack is LIFO method
        System.out.println(stack.peek());  //remove element  same as pop
        System.out.println(stack.search(20)); //search element position
        System.out.println(stack);

    }
}
