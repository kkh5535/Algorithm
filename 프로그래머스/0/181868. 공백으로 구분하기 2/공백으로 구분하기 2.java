class Solution {
    public String[] solution(String my_string) {
      
        String newStr = my_string.replaceAll("\\s+", " ").strip();
        
        return newStr.split(" ");
    }
}