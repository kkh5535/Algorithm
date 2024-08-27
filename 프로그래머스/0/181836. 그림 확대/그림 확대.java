import java.util.*;

class Solution {
    public List<String> solution(String[] picture, int k) {
        List<String> list = new ArrayList<>();
        for (String str : picture) {
            String arrange = "";
            for (int i = 0; i < str.length(); i++) {
                for (int j = 0; j < k; j++) {
                    arrange += str.charAt(i);
                }
            }
            for (int i = 0; i < k; i++) {
                list.add(arrange);
            }
        }
        return list;
    }
}