package calculationTables;

public class RectangularMultiplicationTable {
    // Write a rectangular multiplication printing function.

    public static void main(String[] args) {

        int rows = 10;

        System.out.println("--- --- ---");
        System.out.println("Rectangular multiplication table.");
        System.out.println();

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= rows; j++) {
                System.out.print(i * j + " ");
            }
            System.out.println();
        }
    }
}
