/*Q3: Write a program to calculate the maximum element in the array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 65
Input 2: arr[] = {4,3,6,7,1}
Output 2: 7*/

import java.util.*;

public class Q3
{
    public static void highest(int arr[])
    {
        int greatest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(greatest<arr[i])
            {
                greatest=arr[i];
            }
        }
        System.out.println(greatest);
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements :- ");
        int Elements=sc.nextInt();
        int arr[]= new int[Elements];
        System.out.println("Enter the Elements of Array :- ");

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        highest(arr);
    }
}