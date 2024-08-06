class Solution {
    public int solution(String binomial) {
        int answer = 0;
        String[] array = binomial.split(" ");
        int a = Integer.parseInt(array[0]);
        int b = Integer.parseInt(array[2]);
        String op = array[1];
        
        if (op.equals("+")) {
            return a + b;
        } else if (op.equals("-")) {
            return a - b;
        } else if (op.equals("*")) {
            return a * b;
        }
        return answer;
    }
}