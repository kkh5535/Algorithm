import java.util.Stack;

class Solution {
    public int[] solution(int[] arr, boolean[] flag) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
        for (boolean b : flag) {
            if (b) {
                for (int j = 0; j < arr[i] * 2; j++) {
                    stack.push(arr[i]);
                }
            } else if (!b) {
                for (int j = 0; j < arr[i]; j++) {
                    stack.pop();
                }
            }
            i++;
        } 
        
        
        return stack.stream().mapToInt(Integer::intValue).toArray();
    }
}