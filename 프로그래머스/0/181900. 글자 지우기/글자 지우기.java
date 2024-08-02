class Solution {
    public String solution(String my_string, int[] indices) {
        String answer = "";
        for (int i = 0; i < my_string.length(); i++) {
            boolean flag = true;
            for (int j : indices) {
                if (i == j) {
                    flag = false;
                }
            }
            
            if (flag) {
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}