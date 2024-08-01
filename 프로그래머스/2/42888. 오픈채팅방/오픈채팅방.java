import java.util.HashMap;
import java.util.Map;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public String[] solution(String[] record) {
        Map<String, String> map = new HashMap();
        int stringNum = 0;
        
        for (String line : record) {
            String[] info = line.split(" ");
            String status = info[0];
            String uid = info[1];

            if (status.equals("Enter") || status.equals("Change")) {
                String nick = info[2];
                map.put(uid, nick);                
            }
            
            if (status.equals("Enter") || status.equals("Leave")) {
                stringNum++;
            }
        }
        
        String[] answer = new String[stringNum];
        
        int i = 0;
        for (String line : record) {
            String[] info = line.split(" ");
            String status = info[0];
            String uid = info[1];
            String nick = map.get(uid);

            if (status.equals("Enter")) {
                answer[i++] = nick + "님이 들어왔습니다.";
            } else if (status.equals("Leave")) {
                answer[i++] = nick + "님이 나갔습니다.";
            }
        }
        
            
        return answer;
    }
}