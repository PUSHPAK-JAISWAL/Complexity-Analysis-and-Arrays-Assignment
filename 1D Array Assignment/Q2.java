/*Q2: Write a program to traverse over the elements of the array using for each loop and print all even
elements.
Input 1: arr[] = {34,21,54,65,43}
Output 1: 34 54
Input 2: arr[] = {4,3,6,7,1}
Output 2: 4 6*/

import java.util.*;
public class Q2
{
    public static void print(int arr[])
    {
        for(int i : arr)
        {
            if(i%2==0)
            {
                System.out.print(i+" ");
            }
            else 
            {
                continue;
            }
        }
    }
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int Elements=0;
        System.out.println("Enter the Number of Elements:- ");
        Elements = sc.nextInt();
        System.out.println("Enter the Elements of Array :- ");
        int arr[]=new int[Elements];

        for(int i=0;i<arr.length;i++)
        {
            arr[i]=sc.nextInt();
        }

        print(arr);
    }
}