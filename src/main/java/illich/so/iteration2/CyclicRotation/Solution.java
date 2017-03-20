package illich.so.iteration2.OddOccurrencesInArray.CyclicRotation;

class Solution {
//   For example, given array A = [1,2,3,4,5] and K = 0, the function should return [1,2,3,4,5].
//   For example, given array A = [1,2,3,4,5] and K = 1, the function should return [5,1,2,3,4].
//   For example, given array A = [1,2,3,4,5] and K = 2, the function should return [4,5,1,2,3].
//   For example, given array A = [1,2,3,4,5] and K = 3, the function should return [3,4,5,1,2].
//   For example, given array A = [1,2,3,4,5] and K = 4, the function should return [2,3,4,5,1].
//   For example, given array A = [1,2,3,4,5] and K = 5, the function should return [1,2,3,4,5].


//   For example, given array A = [3, 8, 9, 7, 6] and K = 2, the function should return [6, 3, 8, 9, 7].
//   For example, given array A = [3, 8, 9, 7, 6] and K = 2, the function should return [7, 6, 3, 8, 9].
//   For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].

    int[] getSolution(int[] A, int K) {
        int result[] = new int[A.length];

        for (int i = 0; i < A.length; i++) {
            int rotatedIndex = i + K < A.length ? i + K : (i + K) % A.length;
            result[rotatedIndex] = A[i];
        }
        return result;
    }
}
