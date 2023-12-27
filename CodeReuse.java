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
    }}