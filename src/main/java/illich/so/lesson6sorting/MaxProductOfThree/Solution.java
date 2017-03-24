package illich.so.lesson6sorting.MaxProductOfThree;

//For example, consider array A such that:
//
//        A[0] = 0
//        A[1] = 1
//        A[2] = 0
//        A[3] = 1
//        A[4] = 1
//        We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

import java.util.HashSet;
import java.util.Set;

class Solution {

    int getSolution(int[] A) {
        int firstMaxInteger = Integer.MIN_VALUE;
        int secondMaxInteger = Integer.MIN_VALUE;
        int thirdMaxInteger = Integer.MIN_VALUE;
        for (int i = 0; i < A.length; i++) {
            firstMaxInteger = Math.max(firstMaxInteger, A[i]);
            if (i + 1 < A.length) {
                secondMaxInteger = Math.max(secondMaxInteger, A[i + 1]);
            }
            if (i + 2 < A.length) {
                thirdMaxInteger = Math.max(thirdMaxInteger, A[i + 2]);
            }
        }
        return firstMaxInteger * secondMaxInteger * thirdMaxInteger;
    }
}
