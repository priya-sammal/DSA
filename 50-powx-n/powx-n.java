class Solution {
    public double myPow(double x, int n) {
        long N = n;   // int overflow se bachne ke liye
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double ans = 1.0;
        
        while (N > 0) {
            if ((N & 1) == 1) {   // agar odd hai
                ans *= x;
            }
            x *= x;      // square
            N >>= 1;     // N = N / 2
        }
        
        return ans;
    }
}
