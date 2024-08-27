class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        for (int i = 0; i < n; i++) {
            int[] array = new int[n];
            array[i] = 1;
            answer[i] = array;
        }
        
        return answer;
    }
}