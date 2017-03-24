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
        Set<Integer> distinctNumbers = new HashSet<>();
        for(int element : A){
            distinctNumbers.add(element);
        }
        return distinctNumbers.size();
    }
}
