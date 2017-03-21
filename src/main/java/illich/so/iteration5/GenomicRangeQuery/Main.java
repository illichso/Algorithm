package illich.so.iteration5.GenomicRangeQuery;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        String[] S1 = {"C", "A", "G", "C", "C", "T", "A"};
        int[] P1 = {2, 5, 0};
        int[] Q1 = {4, 5, 6};


        calculateResult(S1, P1, Q1);


    }

    private static void calculateResult(String[] S, int[] P, int[] Q) {
        int[] result = solution.getSolution(S, P, Q);

        System.out.println("For S:");
        for (String element : S) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();

        System.out.println("For P:");
        for (int element : P) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();

        System.out.println("For Q:");
        for (int element : Q) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        System.out.format("the consecutive answers to all queries are:");
        System.out.println();
        for (int element : result) {
            System.out.print(element);
            System.out.print(";");
        }
        System.out.println();
        System.out.println("=================================");
    }
}
