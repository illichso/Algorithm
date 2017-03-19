package illich.so.MaxCounters;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
//        For example, given integer N = 5 and array A such that:
//
//        A[0] = 3
//        A[1] = 4
//        A[2] = 4
//        A[3] = 6
//        A[4] = 1
//        A[5] = 4
//        A[6] = 4
//        the values of the counters after each consecutive operation will be:
//
//        (0, 0, 1, 0, 0)
//        (0, 0, 1, 1, 0)
//        (0, 0, 1, 2, 0)
//        (2, 2, 2, 2, 2)
//        (3, 2, 2, 2, 2)
//        (3, 2, 2, 3, 2)
//        (3, 2, 2, 4, 2)
        int X1 = 5;
        int A1[] = {3, 4, 4, 6, 1, 4, 4};

        calculateResult(X1, A1);

    }

    private static void calculateResult(int X, int[] A) {
        int[] result = solution.getSolution(X, A);
        System.out.print("For X: " + X);
        System.out.println(" and A:");

        for (int element : A) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        System.out.println("result:");
        for (int element : result) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        System.out.println("=================================");
    }

}
