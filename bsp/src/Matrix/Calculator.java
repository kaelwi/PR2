package Matrix;

// alle methoden static, kein objekt notwendig
// aufruf über Klassennamen.methode()
public class Calculator {
    public static int[][] add (int[][] A, int[][] B) {
        // laut Rechneregeln müssen die Matrizen die gleiche Dimension haben
        // wenn dies nicht der Fall ist, keine Berechnung, sondern gleich null zurückgeben
        if (A == null || B == null || A.length != B.length || A[0].length != B[0].length) {
            return null;
        }

        // das resultierende array soll die gleiche größe wie A oder B haben
        int[][] res = new int[A.length][A[0].length];

        // wir müssen zeilen und spalten durchlaufen -> 2 laufvariablen
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                res[i][j] = A[i][j] + B[i][j];
            }
        }

        return res;
    }

    public static int[][] subtract (int[][] A, int[][] B) {
        // ein minus ist das selbe, wie ein A + (-1)*B -> wiederverwendung von schon geschriebenen methoden
        return add(A, scalarMultiplication(B, -1));
    }

    public static int[][] scalarMultiplication (int[][] A, int b) {
        if (A == null) {
            return null;
        }

        int[][] res = new int[A.length][A[0].length];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                res[i][j] = A[i][j] * b;
            }
        }

        return res;
    }

    public static int[][] multiplication (int[][] A, int[][] B) {
        if (A == null || B == null || A.length != B[0].length || A[0].length != B.length) {
            return null;
        }

        // größe des arrays durch rechenregeln gegeben
        // anzahl zeilen = anzahl zeilen von A
        // anzahl spalten = anzahl spalten von B
        int[][] res = new int[A.length][B[0].length];

        // siehe https://en.wikipedia.org/wiki/Matrix_multiplication#Definition
        // man muss nicht genau die multiplikation verstehen, es reicht folgendes:
        // wir wissen, dass A eine m x n matrix ist (oder i x k)
        // B ist eine n x p matrix (k x j)
        // C soll dann eine m x p matrix sein (i x j)
        // laut der 1. formel gilt dann, dass C[i][j] = summer über A[i][k] * B[k][j]
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < B.length; k++) {
                    res[i][j] += A[i][k] * B[k][j];
                }
            }
        }

        return res;
    }

    public static void showResult(int[][] A) {
        if (A == null) {
            System.out.println("Seems like an invalid operation!");
        }

        // 2D array ausgabe -> 2 schleifen notwendig
        for (int i = 0; i < A.length; i++) {
            System.out.print("( ");
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println(")");
        }
        System.out.println();
    }
}
