/* 
 * Here, I came once across with another problem on binary search with a little twist 
 * 
 * In this problem we already given a sorted array and a key, but there is a catch in given
 * array the key element is occuring multiple times and we need to find out it's first occurance, 
 * let's understand it better with a example:- 
 * 
 * Sample 1
 * Array - 12 23 45 56 56 56 78 89
 * key - 56
 * output - 3 (56 is occuring on index 3 for the first time)
 * 
 * Sample 2
 * Array - 12 23 23 23 45 56 78 89
 * key - 23
 * output - 1
*/
import java.util.*;
public class BinarySearchP4 {
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
        int index = binarySearchFirstOccurance(arr, 0, (n-1), target);
        
        if(index == -1){
            System.out.println("Element not present in the array");
        }
        else{
            System.out.println("Element presnt at index: "+ index);
        }

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
}
