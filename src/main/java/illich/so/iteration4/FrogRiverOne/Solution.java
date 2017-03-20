package illich.so.iteration4.FrogRiverOne;

//For example, given X = 5 and array A such that:
//
//        A[0] = 1
//        A[1] = 3
//        A[2] = 1
//        A[3] = 4
//        A[4] = 2
//        A[5] = 3
//        A[6] = 5
//        A[7] = 4
//        the function should return 6, as explained above.

import java.util.HashSet;
import java.util.Set;

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
