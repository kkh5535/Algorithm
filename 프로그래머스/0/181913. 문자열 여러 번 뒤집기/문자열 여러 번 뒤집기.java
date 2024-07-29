import java.util.Stack;

class Solution {
    public String solution(String my_string, int[][] queries) {
        for (int[] arrays : queries) {
            my_string = substr(my_string, arrays);
        }
        
        return my_string;
    }
    
    public String substr(String str, int[] array) {
        Stack stack = new Stack();
        
        String front = str.substring(0, array[0]);
        String end = str.substring(array[1] + 1);
        String reverse = "";
        
        for (int i = array[0]; i <= array[1]; i++) {
            stack.push(str.charAt(i));                
        }
        
        while (!stack.isEmpty()) {
            reverse += stack.pop();
        }
        
        return front + reverse + end;
    }
}