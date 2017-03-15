package illich.so.TapeEquilibrium;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int A1[] = {1, 2};
        int A2[] = {1, 3};
        int A3[] = {2, 3, 1, 5};
        int A4[] = {1, 2, 3, 5};

        calculateResult(A1);
        calculateResult(A2);
        calculateResult(A3);
        calculateResult(A4);

    }

    private static void calculateResult(int[] A) {
        int result = solution.getSolution(A);
        System.out.println("For an array:");

        for (int element : A) {
            System.out.print(element);
        }
        System.out.println();
        System.out.println("The minimal differenceis: [" + result + "]");
        System.out.println("=================================");
    }

}
