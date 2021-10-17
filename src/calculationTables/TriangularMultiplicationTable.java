package calculationTables;

public class TriangularMultiplicationTable {

    // Write a triangular multiplication printing function.

    public static void main(String[] args) {

        int rows = 10;

            for (int i = 1; i <= rows; i++) {
                for (int j = 1; j <= i; j++) {
                    System.out.print(i * j + " ");
                }
                // System.out.println();
            }
    }
}

