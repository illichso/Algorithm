package illich.so.FrogRiverOne;

//For example, array A such that:
//
//        A[0] = 4
//        A[1] = 1
//        A[2] = 3
//        A[3] = 2
//        is a permutation, but array A such that:
//
//        A[0] = 4
//        A[1] = 1
//        A[2] = 3
//        is not a permutation, because value 2 is missing.

import java.util.HashSet;
import java.util.Set;

class Solution {

    int getSolution(int A[]) {
        int theoreticalElement = 0;
        long realSum = 0;
        long theoreticalSum = 0;
        Set<Integer> set = new HashSet<>();

        for (int realElement : A) {
            set.add(realElement);

            theoreticalElement++;

            realSum += realElement;
            theoreticalSum += theoreticalElement;
        }
        if(set.size() == A.length && theoreticalSum - realSum == 0){
            return 1;
        }
        return 0;
    }
}
