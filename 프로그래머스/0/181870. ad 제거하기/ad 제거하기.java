import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> solution(String[] strArr) {
        List<String> list = new ArrayList<>();
        for (String str : strArr) {
            if (str.indexOf("ad") == -1) {
                list.add(str);
            }
        }
        return list;
    }
}