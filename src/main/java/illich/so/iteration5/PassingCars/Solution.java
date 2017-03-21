package illich.so.iteration5.PassingCars;

//For example, consider array A such that:
//
//        A[0] = 0
//        A[1] = 1
//        A[2] = 0
//        A[3] = 1
//        A[4] = 1
//        We have five pairs of passing cars: (0, 1), (0, 3), (0, 4), (2, 3), (2, 4).

class Solution {

    int getSolution(int[] A) {
        int passingCarCounter = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0 && i + 1 < A.length) {
                for (int j = i + 1; j < A.length; j++) {
                    if (A[j] == 1) {
                        passingCarCounter++;
                    }
                }
            }
        }
        if(passingCarCounter > 1_000_000_000){
            return -1;
        }
        return passingCarCounter;
    }

}