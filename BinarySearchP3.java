/*
 * Once again we come up with another question of binary search with a little twist, 
 * 
 * Order-agnostic binary search (you can read about it over internet)
 * 
 * In given question, it is not mentioned that the sorted array is sorted in ascending order or descending 
 * order, so we need to perform some checks bofore cancelling the other half.
 * 
 * eg: 1.
 * Array = hidden[12, 23, 34, 45, 56, 67, 68]
 * target = 23
 * Output = 1 (Element Present at Index 1)
 * 
 * 2.
 * Array = hidden[98, 87, 65, 54, 32, 21]
 * target = 32
 * Output = 4 (Element Present at Index 4) 
 */
import java.util.*;
public class BinarySearchP3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        System.out.print("Enter elements of array: ");
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the element which we need to find: ");
        int target = sc.nextInt();
        sc.close();
        int index = binarySearch(arr, 0, (n-1), target);
        if(index == -1){
            System.out.println("Element not present in the array.");
        }
        else{
            System.out.println("Element is at index: "+ index);
        }
    }
    public static int binarySearch(int[] arr, int start, int end, int target){
        boolean isAsc = arr[0] < arr[arr.length-1];
        while(start <= end){
            int mid = start + end - start / 2;
            if(arr[mid] == target){
                return mid;
            }
            if(isAsc){
                if(arr[mid] < target){
                    start = mid + 1;
                }
                else{
                    end = mid - 1;
                }
            }
            else{
                if(arr[mid] < target){
                    end = mid - 1;
                }
                else{
                    start = mid + 1;
                }
            }
        }
        return -1;
    }
}
