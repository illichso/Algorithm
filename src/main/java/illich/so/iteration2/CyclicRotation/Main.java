package illich.so.iteration2.CyclicRotation;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int A1[] = {1, 2, 3};
        int A2[] = {3, 8, 9, 7, 6};
        int A3[] = {1, 2, 3, 4, 5};

        int K1 = 1;
        int K2 = 3;
        int K3 = 100;
        calculateResult(A1, K1);
        calculateResult(A2, K2);
        calculateResult(A3, K3);

    }

    private static void calculateResult(int[] A, int K) {
        int result[] = solution.getSolution(A, K);
        System.out.println("For K:[" + K + "] and ordinal array:");

        for (int element : A) {
            System.out.print(element);
        }
        System.out.println();
        System.out.println("Rotated result is:");
        for (int element : result) {
            System.out.print(element);
        }
        System.out.println();
        System.out.println("=================================");
    }
}
