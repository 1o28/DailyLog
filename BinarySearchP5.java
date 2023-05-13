/* 
 * It's a similar problem like before with a tweak
 * [Similar file: BinarySearchP4.java]
 * 
 * In this problem we already given a sorted array and a key, but there is a catch in given
 * array the key element is occuring multiple times and we need to find out it's Last occurance, 
 * let's understand it better with a example:- 
 * 
 * Sample 1
 * Array - 12 23 45 56 56 56 78 89
 * key - 56
 * output - 5 (56 is occuring last on index 5)
 * 
 * Sample 2
 * Array - 12 23 23 23 45 56 78 89
 * key - 23
 * output - 3
*/
import java.util.*;
public class BinarySearchP5 {
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
        int index = binarySearchLastOccurance(arr, 0, (n-1), target);
        
        if(index == -1){
            System.out.println("Element not present in the array");
        }
        else{
            System.out.println("Element presnt at index: "+ index);
        }
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
