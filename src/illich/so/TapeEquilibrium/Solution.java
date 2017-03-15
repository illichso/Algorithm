package illich.so.TapeEquilibrium;

//For example, consider array A such that:
//
//        A[0] = 3
//        A[1] = 1
//        A[2] = 2
//        A[3] = 4
//        A[4] = 3
//        We can split this tape in four places:
//
//        P = 1, difference = |3 − 10| = 7
//        P = 2, difference = |4 − 9| = 5
//        P = 3, difference = |6 − 7| = 1
//        P = 4, difference = |10 − 3| = 7
//        Write a function:
//        that, given a non-empty zero-indexed array A of N integers, returns the minimal difference that can be achieved.
//        the function should return 1, as explained above.

import java.util.stream.IntStream;

class Solution {

    int getSolution(int A[]) {
        int leftSum = 0;
        int rightSum = IntStream.of(A).sum();

        int minDiff = Integer.MAX_VALUE;

        for (int i = 0; i < A.length -1; i++) {
            leftSum += A[i];
            rightSum -= A[i];
            int tempDiff = Math.abs(rightSum - leftSum);
            minDiff = Math.min(minDiff, tempDiff);
        }

        return minDiff;
    }
}
