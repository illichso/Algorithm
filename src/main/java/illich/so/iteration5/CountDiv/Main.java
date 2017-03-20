package illich.so.iteration5.CountDiv;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int A1 = 6;
        int B1 = 11;
        int K1 = 2;


        calculateResult(A1, B1, K1);

    }

    private static void calculateResult(int A, int B, int K) {
        long result = solution.getSolution(A, B, K);
        System.out.format("The number of integers within the range [%d..%d] that are divisible by %d is: %d", A, B, K, result);
        System.out.println();
        System.out.println("=================================");
    }
}
