class Solution {
    public int[] solution(int[] arr) {
        int spower = spoweroftwo(arr.length);
        int[] answer = new int[spower];
        for (int i = 0; i < arr.length; i++) {
            answer[i] = arr[i];
        }
        
        return answer;
    }
    
    public int spoweroftwo(int num) {
        int answer = 0;
        while (num > Math.pow(2, answer)) {
            answer++;
        }
        return (int) Math.pow(2, answer);
    }
}