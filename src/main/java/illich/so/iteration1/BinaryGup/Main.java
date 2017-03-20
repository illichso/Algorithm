package illich.so.iteration1.BinaryGup;

import static java.lang.Integer.toBinaryString;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {

        calculateResult(9);
        calculateResult(529);
        calculateResult(20);
        calculateResult(15);
        calculateResult(1041);
        calculateResult(2147483647);

        for (int i = 0; i < 10000; i++) {
            calculateResult(i);
        }

    }

    private static void calculateResult(int value) {
        int result = solution.solution(value);
        System.out.println("for " + value + ", which is " + toBinaryString(value) + " in binary, result: " + result);
    }
}
