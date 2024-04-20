// Q4: Write a program to find the largest element of a given 2D array of integers.

import java.util.*;

public class Q4 {

    public static void greatest(int arr[][]){
        int greatest=Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(greatest<arr[i][j])
                    greatest=arr[i][j];
            }
        }
        System.out.println("The Greatest element is :-  "+greatest);

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
        greatest(arr);
    }
}