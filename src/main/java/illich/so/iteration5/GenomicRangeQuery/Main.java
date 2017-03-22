package illich.so.iteration5.GenomicRangeQuery;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        String S1 = "CAGCCTA";
        int[] P1 = {2, 5, 0};
        int[] Q1 = {4, 5, 6};

        String S2 = "GT";
        int[] P2 = {0, 0, 1};
        int[] Q2 = {0, 1, 1};


        calculateResult(S1, P1, Q1);
//        calculateResult(S2, P2, Q2);


    }

    private static void calculateResult(String S, int[] P, int[] Q) {
        int[] result = solution.getSolution(S, P, Q);

        System.out.println("For S:" + S);

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
