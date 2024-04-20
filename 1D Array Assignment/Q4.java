/*Q4: Write a program to find out the second largest element in a given array.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 54
Input 2: arr[] = {4,3,6,7,1}
Output 2: 6*/

import java.util.*;

public class Q4
{
    public static void SecondLargest(int arr[])
    {
        int greatest = Integer.MIN_VALUE; 
        int secondgreatest = Integer.MIN_VALUE; 

        for(int i = 0; i < arr.length; i++)
        {
            if(arr[i] > greatest)
            {
                secondgreatest = greatest; 
                greatest = arr[i]; 
            }
            else if(arr[i] > secondgreatest && arr[i] != greatest)
            {
                secondgreatest = arr[i]; 
            }
        }
        System.out.println(secondgreatest);
        
    }
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number of Elements:- ");
        int elements= sc.nextInt();

        int arr[]=new int[elements];
        System.out.println("Enter the Elements of Array:- ");
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }
        SecondLargest(arr);
    }
}