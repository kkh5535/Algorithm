import java.util.Arrays;

class Solution {
    public String[] solution(String myString) {
        String[] arrays = myString.split("x");
        
        arrays = Arrays.stream(arrays).filter(s -> !s.isEmpty())
            .toArray(String[]::new);
        
        Arrays.sort(arrays);
        
        return arrays;
    }
}