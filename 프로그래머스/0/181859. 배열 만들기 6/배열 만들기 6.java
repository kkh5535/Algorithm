import java.util.Stack;

class Solution {
    public int[] solution(int[] arr) {
        int[] answer = {-1};
        Stack<Integer> stack = new Stack<>();
        for (int i = 0; i < arr.length; i++) {
            if (stack.isEmpty()) {
                stack.push(arr[i]);
            } else if (stack.peek() == arr[i]) {
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        
        
        return stack.isEmpty() ? answer : stack.stream().mapToInt(Integer::intValue).toArray();
    }
}