class Solution {
    public int solution(String myString, String pat) {
        int answer = 0;

        char[] chars = myString.toCharArray();
        String str = "";
        for (char c : chars) {
            if (c == 'A') {
                str += 'B';
            } else {
                str += 'A';
            }
        }
        if (str.contains(pat)) {
            return 1;
        }

        return answer;
    }
}