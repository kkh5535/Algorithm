import java.util.Arrays;

class Solution {
    public int[][] solution(int[][] arr) {
        int[][] answer = {};
        int i = arr.length;
        int j = arr[0].length;
        if (i > j) {
            answer = new int[i][i];
            for (int k = 0; k < i; k++) {
                answer[k] = Arrays.copyOf(arr[k], i);
            }
        } else {
            answer = new int[j][j];
            for (int k = 0; k < j; k++) {
                if (k < i) {
                    answer[k] = arr[k];
                } else {
                    answer[k] = new int[j];
                }
            }
        }
        return answer;
    }
}