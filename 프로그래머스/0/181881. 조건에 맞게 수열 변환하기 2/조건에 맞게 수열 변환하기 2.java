import java.util.Arrays;

class Solution {
    public int solution(int[] arr) {
        int max = 0;
        for (int num : arr) {
            int count = 0;
            while (!(num > 50 && num % 2 == 1) && !(num < 50 && num % 2 == 0)) {
                if (num >= 50 && num % 2 == 0) {
                    num /= 2;
                    count++;
                } else if (num < 50 && num % 2 == 1) {
                    num = num * 2 + 1;
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        
        return max;
    }
}