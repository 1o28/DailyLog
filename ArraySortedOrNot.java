/* Check the array is sorted in ascending order or not
 * for eg: [1,2,3,4,5] -> Sorted in ascending order
 *         [2,3,4,1,4] -> Not sorted
 */
import java.util.*;
public class ArraySortedOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();
        int[] arr = new int[5];
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
        boolean flag = false;
        for(int i=1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                flag = true;
            }
        }

        if(flag == true){
            System.out.println("Not Sorted");
        }else{
            System.out.println("Sorted");
        }

    }
}
