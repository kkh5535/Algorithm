class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int num = 1;
        int i = 0;
        int j = 0;
        while(answer[i][j] == 0) {
            if (n == 1) {
                answer[i][j] = num;
                break;
            }
            for (int k = 0; k < n-1; k++) {
                answer[i][j++] = num++;
            }
            for (int k = 0; k < n-1; k++) {
                answer[i++][j] = num++;
            }
            for (int k = 0; k < n-1; k++) {
                answer[i][j--] = num++;
            }
            for (int k = 0; k < n-1; k++) {
                answer[i--][j] = num++;
            }
            i++;
            j++;
            n-=2;
        }
        return answer;
    }
}