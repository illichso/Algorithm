package illich.so.iteration5.MinAvgTwoSlice;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int[] A1 = {4, 2, 2, 5, 1, 5, 8};

        calculateResult(A1);
    }

    private static void calculateResult(int[] A) {
        int result = solution.getSolution(A);
        System.out.println("For A:");

        for (int element : A) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        System.out.format("MinAvgTwoSlice: %d", result);
        System.out.println();
        System.out.println("=================================");
    }
}
