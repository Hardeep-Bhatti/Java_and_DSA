/*

import java.util.Scanner;

import java.util.Arrays;

public class Binary_Search_2dArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();

        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j < columns; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int target = scanner.nextInt();

        int result[] = search(matrix, target);

        System.out.println(Arrays.toString(result));

        scanner.close();

    }

    static int[] search(int[][] matrix, int target)
    {
        int start = 0;

        int end = matrix[0].length - 1;

        while (start < matrix.length && end >= 0)
        {
            if (target == matrix[start][end])
            {
                return new int[]{start, end};
            }
            else if (target > matrix[start][end])
            {
                start++;
            }
            else
            {
                end--;
            }
        }

        return new int[]{-1, -1};
    }

}

 */


// Another Approach

import java.util.Scanner;

import java.util.Arrays;

public class Binary_Search_2dArrays {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();

        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        for (int i = 0; i < rows; i++)
        {
            for (int j = 0; j <columns; j++)
            {
                matrix[i][j] = scanner.nextInt();
            }
        }

        int target = scanner.nextInt();

        System.out.println(Arrays.toString(search(matrix, target)));

        scanner.close();

    }

    // Search in the row provided, between the columns provided.
    static int[] binary_search(int[][] matrix, int target, int row, int column_start, int column_end)
    {
        while (column_end <= column_end)
        {
            int mid = column_start + (column_end - column_start) / 2;

            if (matrix[row][mid] == target)
            {
                return new int[]{row, mid};
            }
            else if (target > matrix[row][mid])
            {
                column_start = mid + 1;
            }
            else
            {
                column_end = mid - 1;
            }
        }

        return new int[]{-1, -1};
    }

    static int[] search(int[][] matrix, int target)
    {
        int rows = matrix.length;

        int columns = matrix[0].length;  // Be cautious over here because matrix may be empty.

        // It can be possible that the matrix is of one dimension.

        if (rows == 1)
        {
            return binary_search(matrix, target, 0, 0, columns - 1);
        }

        // Running the loop till 2 rows are remaining.

        int row_start = 0;

        int row_end = rows - 1;

        int middle_column = columns / 2;

        while (row_start < (row_end - 1))     // While this is true, it will have more than 2 rows
        {
            int mid_row = row_start + (row_end - row_start) / 2;

            if (matrix[mid_row][middle_column] == target)
            {
                return new int[]{mid_row, middle_column};
            }
            else if (target > matrix[mid_row][middle_column])
            {
                row_start = mid_row;
            }
            else
            {
                row_end = mid_row;
            }
        }

        // Now we have 2 rows.

        // Check whether the target is in the middle column of 2 rows.

        if (matrix[row_start][middle_column] == target)
        {
            return new int[]{row_start, middle_column};
        }

        if (matrix[row_start + 1][middle_column] == target)
        {
            return new int[]{row_start + 1, middle_column};
        }

        // Search in First half

        if (target < matrix[row_start][middle_column] && target >= matrix[row_start][0])
        {
            return binary_search(matrix, target, row_start, 0, middle_column - 1);
        }

        // Search in Second half

        if (target > matrix[row_start][middle_column] && target <= matrix[row_start][columns - 1])
        {
            return binary_search(matrix, target, row_start, middle_column + 1, columns - 1);
        }

        // Search in Third half

        if (target < matrix[row_start + 1][middle_column] && target >= matrix[row_start + 1][0])
        {
            return binary_search(matrix, target, row_start + 1, 0, middle_column - 1);
        }

        // Search in Fourth half

        if (target > matrix[row_start + 1][middle_column] && target <= matrix[row_start + 1][columns - 1])
        {
            return binary_search(matrix, target, row_start + 1, middle_column + 1, columns - 1);
        }

        return new int[]{-1, -1};
    }

}