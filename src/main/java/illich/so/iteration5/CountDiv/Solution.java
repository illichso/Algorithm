package illich.so.iteration5.CountDiv;

//For example, for A = 6, B = 11 and K = 2, your function should return 3,
// because there are three numbers divisible by 2 within the range [6..11], namely 6, 8 and 10.

class Solution {

    int getSolution(int A, int B, int K) {
        if (A % K == 0)
            return (B - A) / K + 1;
        else {
            return (B - (A - A % K)) / K;
        }
    }


    int getSolution1(int A, int B, int K) {
        int divisibleCounter = 0;
        for (int i = A; i <= B; i++) {
            if (i % K == 0) {
                divisibleCounter++;
            }
        }
        return divisibleCounter;
    }
}