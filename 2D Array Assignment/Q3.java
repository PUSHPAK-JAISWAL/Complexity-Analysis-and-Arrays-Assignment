// Q3: write a program to print the elements of both the diagonals in a user inputted square matrix
// in any order.

import java.util.*;

public class Q3 {
    public static void diagonalElements(int[][] arr) {
        int n = arr.length;
    
        for (int i = 0; i < n; i++) {
            if (i != n - i - 1) {
                System.out.print(arr[i][i] + " ");
            }
        }
    
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][n - i - 1] + " ");
        }
    }
    
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows;
        int columns;
        System.out.println("Enter the Number of rows.:- ");
        rows=sc.nextInt();
        System.out.println("Enter the Number of Columns.:- ");
        columns=sc.nextInt();

        int arr[][]=new int[rows][columns];

        System.out.println("Enter the Elements of the Arrays.:- ");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        diagonalElements(arr);
    }
}