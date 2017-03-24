package illich.so.lesson4countingElements.MissingInteger;


public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int A1[] = {1, 3, 6, 4, 1, 2};
        int A2[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int A3[] = {4, 7, 3, 8, 2, 10, 5, 9, 5, 1, 6};
        int A4[] = new int[100000];
        for (int i = 0; i < 100000; i++) {
            A4[i] = i + 1;
        }


        calculateResult(A1);
        calculateResult(A2);
        calculateResult(A3);
        calculateResult(A4);

    }

    private static void calculateResult(int[] A) {
        long result = solution.getSolution(A);
        System.out.println("For A:");

        for (int element : A) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        System.out.println("the minimal positive integer: " + result);
        System.out.println("=================================");
    }

}