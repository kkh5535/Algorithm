import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public int[] solution(int[] arr, int k) {
        int[] answer = new int[k];
        List<Integer> list = new ArrayList<>();
		Arrays.stream(arr).distinct().forEach(i -> list.add(i));
        for (int i = 0; i < k; i++) {
            if (list.size() <= i) {
                answer[i] = -1;
            } else {
                answer[i] = list.get(i);
            }
        }         
        
        return answer;
    }
}