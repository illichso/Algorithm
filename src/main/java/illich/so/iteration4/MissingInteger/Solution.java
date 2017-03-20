package illich.so.iteration4.MissingInteger;

//For example, given:
//
//        A[0] = 1
//        A[1] = 3
//        A[2] = 6
//        A[3] = 4
//        A[4] = 1
//        A[5] = 2
//        the function should return 5.

import java.util.HashSet;
import java.util.Set;

class Solution {

    int getSolution(int A[]) {
        int minimalMissingInt = 1;
        Set<Integer> set = new HashSet<>();

        for (int element : A) {
            if (element > 0) {
                set.add(element);
            }
        }

        while(set.contains(minimalMissingInt)){
            minimalMissingInt++;
        }
        return minimalMissingInt;
    }
}
