package illich.so.lesson5prefixSums.PassingCars;

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
        long passingCarCounter = 0;
        long incrementer = 0;
        for (int element : A) {
            if (element == 0) {
                incrementer++;
            } else if (element == 1) {
                passingCarCounter = passingCarCounter + incrementer;
            }
        }
        if (passingCarCounter > 1_000_000_000) {
            return -1;
        }
        return (int) passingCarCounter;
    }
}
