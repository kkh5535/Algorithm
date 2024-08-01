class Solution {
    public String solution(String my_string, int s, int e) {
        String answer = "";
        answer += my_string.substring(0, s);
        StringBuilder sb = new StringBuilder(my_string.substring(s, e + 1));
        answer += sb.reverse().toString();
        
        answer += my_string.substring(e + 1);
        
        return answer;
    }
}