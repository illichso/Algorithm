package illich.so.iteration4.PermCheck.FrogRiverOne;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int X1 = 5;
        int A1[] = {1, 3, 1, 4, 2, 3, 5, 4};

        calculateResult(X1, A1);

    }

    private static void calculateResult(int X, int[] A) {
        long result = solution.getSolution(X, A);
        System.out.print("For X: " + X);
        System.out.println(" and A:");

        for (int element : A) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        if (result > 0) {
            System.out.println("the earliest time when the frog can jump to the other side of the river: " + result + ".");
        } else if (result == -1) {
            System.out.println("the frog is never able to jump to the other side of the river,");
        }
        System.out.println("=================================");
    }

}
