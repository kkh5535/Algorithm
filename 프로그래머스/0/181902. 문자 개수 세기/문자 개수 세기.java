import java.util.HashMap;
import java.util.Map;

class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        Map<Character, Integer> map = new HashMap<>();
        
        for (char c : my_string.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        
        for (char c = 'A'; c <= 'Z'; c++) {
            answer[c - 'A'] = map.containsKey(c) ? map.get(c) : 0;
        }
        
        for (char c = 'a'; c <= 'z'; c++) {
            answer[c - 'a' + 'z' - 'a' + 1] = map.containsKey(c) ? map.get(c) : 0;
        }
        
        return answer;
    }
}