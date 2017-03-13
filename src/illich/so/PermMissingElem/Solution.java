package illich.so.PermMissingElem;

//For example, given array A such that:
//
//        A[0] = 2
//        A[1] = 3
//        A[2] = 1
//        A[3] = 5
//        the function should return 4, as it is the missing element.

class Solution {

    int getSolution(int A[]) {
        int B[] = new int[A.length + 1];
        for (int element : A) {
            B[element - 1] = element;
        }

        int notZeroElement = 1;

        for (int element : B) {
            if (element == 0) {
                return notZeroElement;
            }
            notZeroElement = element + 1;
        }
        return notZeroElement;
    }
}
