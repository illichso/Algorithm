package illich.so.lesson3timeComplexity.TapeEquilibrium;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int A1[] = {1, 20};
        int A2[] = {0, 2000};
        int A3[] = {2, 3, 1, 5};
        int A4[] = {1, 2, 3, 5};
        int A5[] = {3, 1, 2, 4, 3};

        calculateResult(A1);
        calculateResult(A2);
        calculateResult(A3);
        calculateResult(A4);
        calculateResult(A5);

    }

    private static void calculateResult(int[] A) {
        long result = solution.getSolution(A);
        System.out.println("For an array:");

        for (int element : A) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        System.out.println("The minimal difference is: [" + result + "]");
        System.out.println("=================================");
    }

}
