package illich.so.PermCheck;

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

class Solution {

    int getSolution(int A[]) {
        int theoreticalElement = 0;
        long realSum = 0;
        long theoreticalSum = 0;

        for (int realElement : A) {
            theoreticalElement++;

            realSum += realElement;
            theoreticalSum += theoreticalElement;
        }
        if(theoreticalSum - realSum == 0){
            return 1;
        }
        return 0;
    }
}
