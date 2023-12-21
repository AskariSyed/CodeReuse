import java.util.Arrays;
import java.util.Scanner;

public class CodeReuse {

    // Q1: Sort array in ascending order
    public static void sortAscending(int[] array) {
        Arrays.sort(array);
    }

    // Q3: Calculate statistics (Max, Min, Average)
    public static double[] calculateStats(int[] array) {
        double[] result = new double[3];
        if (array.length > 0) {
            Arrays.sort(array);
            result[0] = array[array.length - 1]; // Max
            result[1] = array[0]; // Min
            result[2] = Arrays.stream(array).average().orElse(Double.NaN); // Average
        }
        return result;
    }

    // Q5: Matrix addition
    public static int[][] matrixAddition(int[][] matrixA, int[][] matrixB, int rows, int columns) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        System.out.println(result);
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input for array
        System.out.println("Enter the size of the array:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        System.out.println("Enter elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        // Sorting array in ascending order
        sortAscending(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        // Input for matrixA
        System.out.println("Enter the number of rows for matrixA:");
        int rowsA = scanner.nextInt();
        System.out.println("Enter the number of columns for matrixA:");
        int columnsA = scanner.nextInt();
        int[][] matrixA = new int[rowsA][columnsA];
        System.out.println("Enter elements of matrixA:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                System.out.println("Enter element for matrixA[" + i + "][" + j + "]:");
                matrixA[i][j] = scanner.nextInt();
            }
        }

        // Input for matrixB
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Enter the number of rows for matrixB:");
        int rowsB = scanner.nextInt();
        System.out.println("Enter the number of columns for matrixB:");
        int columnsB = scanner.nextInt();
        int[][] matrixB = new int[rowsA][columnsA];
        System.out.println("Enter elements of matrixB:");
        for (int i = 0; i < rowsA; i++) {
            for (int j = 0; j < columnsA; j++) {
                System.out.println("Enter element for matrixB[" + i + "][" + j + "]:");
                matrixB[i][j] = scanner.nextInt();
            }
        }
        // Sorting array in ascending order
        sortAscending(array);
        System.out.println("Sorted Array: " + Arrays.toString(array));

        // Calculating statistics for array
        double[] stats = calculateStats(array);
        System.out.println("Max: " + stats[0] + ", Min: " + stats[1] + ", Avg: " + stats[2]);

        // Adding matrices
        if (rowsA == rowsB && columnsA == columnsB) {
            int[][] resultMatrix = matrixAddition(matrixA, matrixB, rowsA, columnsA);
            System.out.println("Matrix Addition Result:");
            for (int[] row : resultMatrix) {
                System.out.println(Arrays.toString(row));
            }
        } else {
            System.out.println("Matrix addition is not possible. Dimensions are not compatible.");
        }

        scanner.close();
    }
}
