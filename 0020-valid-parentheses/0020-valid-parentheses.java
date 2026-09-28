//  this is core concept of the stacks
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '[' || ch == '{') {
                stack.push(ch);
            } else {

                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if (ch == ')' && top != '(') {
                    return false;
                }

                if (ch == ']' && top != '[') {
                    return false;
                }

                if (ch == '}' && top != '{') {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}


// This is the core question of the stack and queue and AKTU best question for the asking for the semester in dsa ...