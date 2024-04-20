// Q5: Write a function which accepts a 2D array of integers and its size as arguments and
// displays the elements of middle row and the elements of middle column. Printing can
// be done in any order.
// [Assuming the 2D Array to be a square matrix with odd dimensions i.e. 3x3, 5x5, 7x7 etc...]

import java.util.*;

public class Q5 {

    public static void printMiddleRowAndColumn(int[][] arr) {
        int n = arr.length;
        int mid = n / 2;
    
       System.out.println("The Elements are :- ");
        for (int j = 0; j < n; j++) {
            System.out.print(arr[mid][j] + " ");
        }
    
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i][mid] + " ");
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
        printMiddleRowAndColumn(arr);
    }
}