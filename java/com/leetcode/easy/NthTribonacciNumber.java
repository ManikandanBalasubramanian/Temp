import com.leetcode.easy;

public class NthTribonacciNumber {

    public int tribonacci(int n) {
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        
        if(n <= 1) return n;
        
        while (n > 2) {
            int temp = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = temp;
            n--;
        }
        
        return t2;
    }
}