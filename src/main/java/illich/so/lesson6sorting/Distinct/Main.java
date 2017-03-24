package illich.so.lesson6sorting.Distinct;

public class Main {

    private static Solution solution = new Solution();

    //TODO
    public static void main(String[] args) {
        int[] A1 = {2, 1, 1, 2, 3, 1};

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
        System.out.format("the number of distinct values: %d", result);
        System.out.println();
        System.out.println("=================================");
    }
}
