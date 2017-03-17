package illich.so.MissingInteger;

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
