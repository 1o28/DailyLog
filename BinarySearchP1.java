import java.util.*;
class BinarySearchP1{
    public static int binarySearch(int[] arr, int start, int end, int target){
        // int result = -1;
        while(start <= end){
            int mid = start + (end - start) / 2;
            if(arr[mid] == target){
                return mid;
            }
            else if(arr[mid] < target){
                start = mid + 1;
            }
            else{
                end = mid - 1;
            }
        }
        return -1;
    }
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
        // System.out.println(n-1);
        int index = binarySearch(arr, 0, (n-1), target);
        if(index == -1){
            System.out.println("Element not present in the array.");
        }
        else{
            System.out.println("Element is at index: "+ index);
        }
    }
}