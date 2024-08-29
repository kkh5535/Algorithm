import java.util.*;

class Solution {
    public int[] solution(int[][] arr) {
        int[] answer = new int[2];
        
        return quadOperation(arr, answer);
    }
    
    public int[] quadOperation(int[][] arr, int[] answer) {
        if (checkArray(arr) == 1) {
            answer[1] += 1;
            return answer;
        } else if (checkArray(arr) == 0) {
            answer[0] += 1;
            return answer;
        }
        int length = arr.length / 2;
        int[][] first = new int[length][length];
        int[][] second = new int[length][length];
        int[][] third = new int[length][length];
        int[][] fourth = new int[length][length];
        
        for (int i = 0; i < length; i++) {
            first[i] = Arrays.copyOfRange(arr[i], 0, length);
            second[i] = Arrays.copyOfRange(arr[i], length, length * 2);
            third[i] = Arrays.copyOfRange(arr[i + length], 0, length);
            fourth[i] = Arrays.copyOfRange(arr[i + length], length, length * 2);
        }
        
        if (checkArray(first) == 1) {
            answer[1] += 1;
        } else if (checkArray(first) == 0) {
            answer[0] += 1;
        } else {
            answer = quadOperation(first, answer);
        }
        
        if (checkArray(second) == 1) {
            answer[1] += 1;
        } else if (checkArray(second) == 0) {
            answer[0] += 1;
        } else {
            answer = quadOperation(second, answer);
        }
        
        if (checkArray(third) == 1) {
            answer[1] += 1;
        } else if (checkArray(third) == 0) {
            answer[0] += 1;
        } else {
            answer = quadOperation(third, answer);
        }
        
        if (checkArray(fourth) == 1) {
            answer[1] += 1;
        } else if (checkArray(fourth) == 0) {
            answer[0] += 1;
        } else {
            answer = quadOperation(fourth, answer);
        }
        
        return answer;
    }
    
    public int checkArray(int[][] arr) {
        if (arr[0][0] == 0) {
            for (int[] array : arr) {
                for (int i : array) {
                    if (i == 1) {
                        return -1;
                    }
                }
            }
            return 0;
        } else {
            for (int[] array : arr) {
                for (int i : array) {
                    if (i == 0) {
                        return -1;
                    }
                }
            }
            return 1;
        }
    }
}