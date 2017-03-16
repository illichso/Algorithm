package illich.so.PermCheck;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int A1[] = {4, 1, 3, 2};
        int A2[] = {4, 1, 3};

        calculateResult(A1);
        calculateResult(A2);
    }

    private static void calculateResult(int[] A) {
        long result = solution.getSolution(A);
        System.out.println("Array:");

        for (int element : A) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        if(result == 1){
            System.out.println(" is a permutation.");
        }else if (result == 0){
            System.out.println(" is NOT a permutation.");
        }
        System.out.println("=================================");
    }

}
