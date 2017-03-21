package illich.so.iteration5.PassingCars;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int[] A1 = {0, 1, 0, 1, 1};
        int[] A2 = {0, 0, 0, 0, 0};
        int[] A3 = {1, 1, 1, 1, 1};


        calculateResult(A1);
        calculateResult(A2);
        calculateResult(A3);

    }

    private static void calculateResult(int[] A) {
        int result = solution.getSolution(A);
        System.out.println("For A:");

        for (int element : A) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        System.out.format("the number of pairs of passing cars is: %d", result);
        System.out.println();
        System.out.println("=================================");
    }
}
