// Q2: write a program to print the elements above the secondary diagonal in a user inputted
// square matrix.

import java.util.*;

public class Q2 {

    public static void Secondary(int[][] arr) {
        System.out.println("Element are :- ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length - i - 1; j++) {
                System.out.print(arr[i][j] + " ");
            }
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
        Secondary(arr);
    }
}