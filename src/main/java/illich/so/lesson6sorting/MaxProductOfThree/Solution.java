package illich.so.lesson6sorting.MaxProductOfThree;

class Solution {

    int getSolution(int[] A) {
        int firstMaxInteger = Integer.MIN_VALUE;
        int secondMaxInteger = Integer.MIN_VALUE;
        int thirdMaxInteger = Integer.MIN_VALUE;
        for (int element : A) {
            if (element > firstMaxInteger) {
                thirdMaxInteger = secondMaxInteger;
                secondMaxInteger = firstMaxInteger;
                firstMaxInteger = element;
            } else if (element > secondMaxInteger) {
                thirdMaxInteger = secondMaxInteger;
                secondMaxInteger = element;
            } else if (element > thirdMaxInteger) {
                thirdMaxInteger = element;
            }
        }

        return firstMaxInteger * secondMaxInteger * thirdMaxInteger;
    }
}
