import java.util.Map;
import java.util.HashMap;

class Solution {
    public int solution(String[] strArr) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (String str : strArr) {
            Integer count;
            if (map.containsKey(str.length())) {
                count = map.get(str.length());
            } else {
                count = 0;
            }
            map.put(str.length(), count + 1);
        }
        return map.values().stream().max(Integer::compareTo).get();
    }
}