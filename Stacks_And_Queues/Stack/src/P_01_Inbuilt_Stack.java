import java.util.Stack;

public class P_01_Inbuilt_Stack {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // Add element in stack.
        st.push(28);
        st.push(25);
        st.push(94);
        st.push(14);
        st.push(44);

        // Check top most element.
        System.out.println(st.peek());

        // Check for empty stack.
        System.out.println(st.empty());

        // Remove element from stack.
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}
