package illich.so.FrogJmp;

//For example, given:
//
//        X = 10
//        Y = 85
//        D = 30
//        the function should return 3, because the frog will be positioned as follows:
//
//        after the first jump, at position 10 + 30 = 40
//        after the second jump, at position 10 + 30 + 30 = 70
//        after the third jump, at position 10 + 30 + 30 + 30 = 100

class Solution {

    int getSolution(int X, int Y, int D) {
        int multiplier = (Y - X) / D;
        int decimalPart = (Y - X) % D;
        if (decimalPart != 0) {
            multiplier++;
        }

        return multiplier;
    }
}
