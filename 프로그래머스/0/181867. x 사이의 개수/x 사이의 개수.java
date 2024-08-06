class Solution {
    public int[] solution(String myString) {
        int[] answer = {};
        String[] array = myString.split("x");
        answer = new int[array.length + (myString.endsWith("x") ? 1 : 0)];
        int i = 0;
        for (String str : array) {
            answer[i++] = str.length(); 
        }
        return answer;
    }
}