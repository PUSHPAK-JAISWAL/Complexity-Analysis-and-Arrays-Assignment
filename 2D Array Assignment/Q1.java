// Q1: Take m and n input from the user and m * n integer inputs from user and print the following:
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0.
// Input 1:

// Output :
// number of positive numbers = 7
// number of negative numbers = 6
// number of odd numbers = 7
// number of even numbers = 9
// number of 0 = 3

import java.util.*;

public class Q1 {

    public static void Operations(int arr[][]){
        int positive=0,negative=0,count_even=0,count_odd=0,count_zero=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                if(0<arr[i][j])
                    positive++;
                else if(0>arr[i][j])
                    negative++;
                else
                    count_zero++;

                if(arr[i][j]%2==0)
                    count_even++;
                else
                    count_odd++;
            }
        }
        System.out.println("Number of Positive Numbers.:- "+positive);
        System.out.println("Number of Negative Numbers.:- "+negative);
        System.out.println("Number of Odd Numbers.:- "+count_odd);
        System.out.println("Number of Even Numbers.:- "+count_even);
        System.out.println("Number of Zeros.:- "+count_zero);
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
        Operations(arr);
    }
}