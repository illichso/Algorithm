package illich.so.iteration5.CountDiv;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int A1[] = {4, 1, 3, 2};
        int A2[] = {4, 1, 3};
        int A3[] = {1};
        int A4[] = {3};
        int A5[] = {1, 2};
        int A6[] = {2, 1};
        int A7[] = {1, 3};
        int A8[] = {3, 1};
        int A9[] = {1, 1, 3, 4};

        calculateResult(A1);
        calculateResult(A2);
        calculateResult(A3);
        calculateResult(A4);
        calculateResult(A5);
        calculateResult(A6);
        calculateResult(A7);
        calculateResult(A8);
        calculateResult(A9);
    }

    private static void calculateResult(int[] A) {
        long result = solution.getSolution(A);
        System.out.println("Array:");

        for (int element : A) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        if (result == 1) {
            System.out.println("is a permutation.");
        } else if (result == 0) {
            System.out.println("is NOT a permutation.");
        }
        System.out.println("=================================");
    }

}
