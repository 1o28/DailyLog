/*
 * Problem Objective: We are given a already sorted array and a key element[target/key], 
 *         Now, our objective is to find out the total count of the target element. 
 *         Let's understand it better with the help of an example.
 * 
 * Example 1
 * Array - 12 23 45 56 56 56 56 78
 * target - 56
 * Output - 4 (Total count of target element is 4 in the given array)
 * 
 * Example 2
 * Array - 21 54 54 54 54 54 87 98 65
 * target - 54
 * Output - 5
 */
import java.util.*;
public class BinarySearchP6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements of array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++)
            arr[i] = sc.nextInt();
        System.out.print("Enter the element whose count we need to find: ");
        int target = sc.nextInt();
        sc.close();
        int firstOccurance = binarySearchFirstOccurance(arr, 0, (n-1), target);
        int lastOccurance = binarySearchLastOccurance(arr, 0, (n-1), target);
        
        if(firstOccurance == -1 || lastOccurance == -1)
            System.out.println("Element is not present.");
        else
            System.out.print("Total count of target element is: "+ ((lastOccurance - firstOccurance) + 1));
    }
    public static int binarySearchFirstOccurance(int[] arr, int st, int end, int target){   
        int result = -1;
        while(st <= end){
            int mid = st + (end - st) /2;
            if(arr[mid] == target){
                result = mid;
                end = mid - 1;
            }
            else if(arr[mid] < target){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }
    public static int binarySearchLastOccurance(int[] arr, int st, int end, int target){   
        int result = -1;
        while(st <= end){
            int mid = st + (end - st) /2;
            if(arr[mid] == target){
                result = mid;
                st = mid + 1;
            }
            else if(arr[mid] < target){
                st = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return result;
    }
}
