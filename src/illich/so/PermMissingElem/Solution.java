package illich.so.PermMissingElem;

//For example, given array A such that:
//
//        A[0] = 2
//        A[1] = 3
//        A[2] = 1
//        A[3] = 5
//        the function should return 4, as it is the missing element.
//0+2 = 2
//2+3 = 5
//5+1 = 6
//6+5 = 1
//
//1
//1+1 = 2

class Solution {

    int getSolution(int A[]) {
        long realElement = 0;
        long theoreticalElement = 1;

        long realSum = 0;
        long theoreticalSum = 1;

        int iterationCounter = 0;

        for (int element : A) {
            iterationCounter++;

            realElement = element;
            theoreticalElement = theoreticalElement + 1;

            realSum = realSum + realElement;
            theoreticalSum = theoreticalSum + theoreticalElement;
        }
        System.out.println("Total iterations: " + iterationCounter);
        System.out.println("theoreticalSum: " + theoreticalSum);
        System.out.println("realSum: " + realSum);
        int result = (int) (theoreticalSum - realSum);
        System.out.println("theoreticalSum - realSum: " + result);
        return result;
    }

    int getSolutionNStorage(int A[]) {
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
