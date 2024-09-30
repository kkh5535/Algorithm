class Solution {
    public String solution(String cipher, int code) {
        String answer = "";
        char[] chars = cipher.toCharArray();
        for (int i = code - 1; i < chars.length; i += code) {
            answer += chars[i];
        }
        return answer;
    }
}