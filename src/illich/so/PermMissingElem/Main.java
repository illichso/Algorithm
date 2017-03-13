package illich.so.PermMissingElem;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int A1[] = {};
        int A2[] = {1};
        int A3[] = {1, 2};
        int A4[] = {1, 3};
        int A5[] = {2, 3, 1, 5};

        calculateResult(A1);
        calculateResult(A2);
        calculateResult(A3);
        calculateResult(A4);
        calculateResult(A5);

    }

    private static void calculateResult(int[] A) {
        int result = solution.getSolution(A);
        System.out.println("For an array:");

        for (int element : A) {
            System.out.print(element);
        }
        System.out.println();
        System.out.println("The missing element is: [" + result + "]");
        System.out.println("=================================");
    }

}
