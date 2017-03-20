package illich.so.iteration5.CountDiv;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int A1 = 6;
        int B1 = 11;
        int K1 = 2;

        int A2 = 6;
        int B2 = 11;
        int K2 = 3;

        int A3 = 0;
        int B3 = 2_000_000_000;
        int K3 = 2;

        int A4 = 0;
        int B4 = 2_147_483_647;
        int K4 = 2;

        calculateResult(A1, B1, K1);
        calculateResult(A2, B2, K2);
        calculateResult(A3, B3, K3);
        calculateResult(A4, B4, K4);

    }

    private static void calculateResult(int A, int B, int K) {
        long start = System.nanoTime();
        long result = solution.getSolution(A, B, K);
        long end = System.nanoTime();
        double spentNanoSeconds = end - start;
        double spentSeconds = spentNanoSeconds / 1_000_000_000;
        System.out.format("The number of integers within the range [%d..%d] that are divisible by %d is: %d and it took %f nanoseconds, or %f seconds.",
                A, B, K, result, spentNanoSeconds, spentSeconds);
        System.out.println();
        System.out.println("=================================");
    }
}
