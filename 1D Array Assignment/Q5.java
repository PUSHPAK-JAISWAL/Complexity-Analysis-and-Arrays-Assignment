// Q5: Given an array. Find the first peak element in the array. A peak element is an element that is greater than
// its just left and just right neighbor.
// Input 1: arr[] = {1,3,2,6,5}
// Output 1: 6
// Input 2: arr[] = {1 4,7,3,2,6,5}
// Output 2: 7

import java.util.*;

public class Q5 {

    public static void peakElement(int arr[]) {
        int peak=0;
        for (int i = 0; i < arr.length; i++) {
            if(i==0) {
                continue;
            }
            else if(i==(arr.length-1)) {
                System.out.println("NO Peak Elements are Present.");
            }
            else if (arr[i]>arr[i-1] && arr[i]>arr[i+1]) {
                peak = arr[i];
                break;
            }
        }
        System.out.println(peak);
    }
    public static void main(String[] args) {
        int elements;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number of Elements.:- ");
        elements=sc.nextInt();

        int arr[]=new int[elements];
        System.out.println("Enter the Elements of Array.:- ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        peakElement(arr);
    }
}
