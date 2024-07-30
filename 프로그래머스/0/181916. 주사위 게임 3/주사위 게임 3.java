import java.util.Arrays;

class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        int[] array = {a, b, c, d};
        Arrays.sort(array);
        a = array[0];
        b = array[1];
        c = array[2];
        d = array[3];
        
        if (a == d) {
            return operationFirst(a);
        } else if (a == b) {
            if (b == c) {
                return operationSecond(a, d);
            } else if (c == d) {
                return operationThird(a, c);
            } else {
                return operationFourth(c, d);
            }
        } else if (b == c) {
            if (c == d) {
                return operationSecond(d, a);
            } else {
                return operationFourth(a, d);
            }
        } else {
            if (c == d) {
                return operationFourth(a, b);
            } else {
                return operationLast(a);
            }
        }
    }
    
    public int operationFirst(int p) {
        return 1111 * p;
    }
    
    public int operationSecond(int p, int q) {
        return (int) Math.pow(10 * p + q, 2);
    }
    
    public int operationThird(int p, int q) {
        return (p + q) * Math.abs(p - q);
    }
    
    public int operationFourth(int q, int r) {
        return q * r;
    }
    
    public int operationLast(int s) {
        return s;
    }
}