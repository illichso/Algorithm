package illich.so.MaxCounters;

import java.util.HashSet;
import java.util.Set;

//For example, given integer N = 5 and array A such that:
//        A[0] = 3
//        A[1] = 4
//        A[2] = 4
//        A[3] = 6
//        A[4] = 1
//        A[5] = 4
//        A[6] = 4
//        the values of the counters after each consecutive operation will be:
//
//        (0, 0, 1, 0, 0)
//        (0, 0, 1, 1, 0)
//        (0, 0, 1, 2, 0)
//        (2, 2, 2, 2, 2)
//        (3, 2, 2, 2, 2)
//        (3, 2, 2, 3, 2)
//        (3, 2, 2, 4, 2)
//        The goal is to calculate the value of every counter after all operations.

class Solution {

    int getSolution(int X, int[] A) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
            if (set.size() == X) {
                return i;
            }
        }
        return -1;
    }
}
