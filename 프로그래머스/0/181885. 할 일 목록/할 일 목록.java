import java.util.List;
import java.util.ArrayList;

class Solution {
    public List<String> solution(String[] todo_list, boolean[] finished) {
        List<String> list = new ArrayList<>();
        for (int i = 0; i < finished.length; i++) {
            if (finished[i] == false) {
                list.add(todo_list[i]);
            }
        }
        return list;
    }
}