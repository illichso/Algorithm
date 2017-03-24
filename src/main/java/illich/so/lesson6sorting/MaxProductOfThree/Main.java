package illich.so.lesson6sorting.MaxProductOfThree;

public class Main {

    private static Solution solution = new Solution();

    //TODO
    public static void main(String[] args) {
        int[] A1 = {-3, 1, 2, -2, 5, 6};
        int[] A2 = {-5, 5, -5, 4};

//        calculateResult(A1);
        calculateResult(A2);
    }

    private static void calculateResult(int[] A) {
        int result = solution.getSolution(A);
        System.out.println("For A:");

        for (int element : A) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        System.out.format("he value of the maximal product of any triplet: %d", result);
        System.out.println();
        System.out.println("=================================");
    }
}
