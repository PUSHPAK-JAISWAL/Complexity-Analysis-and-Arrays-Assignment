/*Q1: Write a program to print the sum of all the elements present on even indices in the given array.
Input 1: arr[] = {3,20,4,6,9}
Output 1: 16
Input 1: arr[] = {4,3,6,7,1}
Output 1: 11*/

import java.util.*;

public class Q1
{
    public static int sum(int arr[])
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        {
            if(i%2==0)
            {
                sum+=arr[i];
            }
        }
        return sum;
    }
    public static void main(String args[])
    {

        int Elements=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter The Number of Elements := ");
        Elements = sc.nextInt();
        int arr[]=new int[Elements];

        System.out.println("Enter the Elements of the Array.:-");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        System.out.println("The Sum of the Elements present on the even indices :- "+sum(arr));
        sc.close();
    }
}