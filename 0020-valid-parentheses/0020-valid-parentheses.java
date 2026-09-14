import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++) {
            char ch11 = s.charAt(i);
            if(ch11 == '(') {
                st.push(')');
            }
            else if(ch11 == '[') {
                st.push(']');
            }
            else if(ch11 == '{') {
                st.push('}');
            }
            else {
                if(st.isEmpty() || st.peek() != ch11) {
                    return false;
                }
                st.pop();
            }
        }

        return st.isEmpty();
    }
}