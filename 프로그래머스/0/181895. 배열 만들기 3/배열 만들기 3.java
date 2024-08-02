class Solution {
    public int[] solution(int[] arr, int[][] intervals) {
        int[] first = intervals[0];
        int[] second = intervals[1];
        int firstInterval = first[1] - first[0] + 1;
        int secondInterval = second[1] - second[0] + 1;
        int[] answer = new int[firstInterval + secondInterval];
        
        for (int i = 0; i < firstInterval; i++) {
            answer[i] = arr[first[0] + i];
        }
        
        for (int i = 0; i < secondInterval; i++) {
            answer[firstInterval + i] = arr[second[0] + i];
        }
        
        return answer;
    }
}