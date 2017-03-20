package illich.so.iteration4.MaxCounters;

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

    int[] getSolution(int N, int[] A) {
        int[] counters = new int[N];
        int maxCounter = 0;

        for (int counterIndex : A) {
            if (counterIndex < N + 1) {
                counters[counterIndex - 1]++;
                maxCounter = maxCounter < counters[counterIndex - 1] ? counters[counterIndex - 1] : maxCounter;
            } else if (maxCounter > 0) {
                for (int i = 0; i < counters.length; i++) {
                    counters[i] = maxCounter;
                }
            }
        }
        return counters;
    }
}
