CodeReuse Class Documentation:

This class provides reusable methods for sorting arrays, calculating statistics,
and performing matrix operations such as addition.

      Method: sortAscending

   Sorts the given array in ascending order.
   
   Parameters:
      array: The array of integers to be sorted.

      Method: calculateStats

   Calculates statistics (Max, Min, Average) for the given array.
   
   Parameters:
    array: The array of integers for which statistics are calculated.
   
   Returns:
   An array of doubles containing Max, Min, and Average values in that order.
   
       Method: matrixAddition

   Adds two matrices and returns the result.
   
   Parameters:
   - matrixA: The first matrix.
   - matrixB: The second matrix.
   - rows: The number of rows in the matrices.
   - columns: The number of columns in the matrices.
   
   Returns:
   - The resulting matrix after adding matrixA and matrixB.
   
         Method: main

   The main method allows users to interactively input data and demonstrates
   the usage of the provided methods.
   
   Usage:
   - The user is prompted to enter the size and elements of an array.
   - The array is then sorted in ascending order and displayed.
   - The user is prompted to enter the dimensions and elements of two matrices (matrixA and matrixB).
   - The array is sorted again, and statistics (Max, Min, Average) are calculated and displayed.
   - The matrices are added if their dimensions are compatible, and the result is displayed.

Note: Please ensure proper input validation and handling for real-world applications.
