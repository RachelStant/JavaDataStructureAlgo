import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
//        boolean result = isValid("()[]{}");
//        System.out.println(result);

        String[] strs = new String[] {"()[]{}", "(({}))", "([]}"};
        for (String str : strs) {
            System.out.printf("%s = %s%n", str, isValidOptimized(str));
        }

    }


    public static boolean isValidOptimized(String s) {
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }




    public static boolean isValid(String s) {
        Stack<Character> charStack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char myChar = s.charAt(i);
            if (myChar == '(' || myChar == '{' || myChar == '[') {
                charStack.push(myChar);
            } else if (myChar == ')' || myChar == '}' || myChar == ']') {
                if (charStack.isEmpty()) {
                    return false;
                }
                char top = charStack.pop();
                if (!isMatchingChar(top, myChar)) {
                    return false;
                }
            }
        }
        return charStack.isEmpty();
    }

    public static boolean isMatchingChar(char open, char close) {
        return (open == '(' && close == ')') || (open == '{' && close == '}') || (open == '[' && close == ']');
    }
}
