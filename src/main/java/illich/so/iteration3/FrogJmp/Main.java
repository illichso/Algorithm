package illich.so.iteration3.FrogJmp;

public class Main {

    private static Solution solution = new Solution();

    public static void main(String[] args) {
        int X = 10;
        int Y = 80;
        int D = 30;
        calculateResult(X, Y, D);


    }

    private static void calculateResult(int X, int Y, int D) {
        int result = solution.getSolution(X, Y, D);
        System.out.println("For X: [" + X + "], Y: [" + Y + "], D:[" + D + "], result is: [" + result + "].");
        System.out.println("=================================");
    }

}
