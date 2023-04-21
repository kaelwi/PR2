package Matrix;

public class MatrixDemo {
    public static void main(String[] args) {
        int[][] A = {{3, 4, -5}, {2, 1, 0}};
        int[][] B = {{2, -3, 6}, {0, 4, 1}};

        int[][] C = Calculator.add(A, B);
        Calculator.showResult(C);

        int[][] D = Calculator.scalarMultiplication(A, 5);
        Calculator.showResult(D);

        int[][] E = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};
        int[][] F = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}};

        int[][] G = Calculator.multiplication(E, F);
        Calculator.showResult(G);
    }
}
