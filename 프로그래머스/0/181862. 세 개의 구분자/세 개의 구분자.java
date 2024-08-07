import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> solution(String myStr) {

        List<String> list = new ArrayList<>();
        char[] array = myStr.toCharArray();
        String str = "";
        for (char c : array) {
            if (c == 'a' || c == 'b' || c == 'c') {
                if (!str.equals("")) {
                    list.add(str);
                    str = "";
                }
            } else {
                str += c;
            }
        }
        if (!str.equals("")) {
            list.add(str);
        }
        if (list.isEmpty()) {
            list.add("EMPTY");
        }
        
        return list;
    }
}