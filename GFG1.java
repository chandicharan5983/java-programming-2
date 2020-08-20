import java.util.Arrays; 
import java.util.Collections;  
class GFG1 { 
    //returns kth smallest element in a given array 
    public static int kthSmallest(Integer[] arr, int k) 
    { 
        // Sorting
        Arrays.sort(arr);
        // Return kth element in the sorted array 
        return arr[k - 1]; 
    } 
  
    // driver program 
    public static void main(String[] args) 
    { 
        Integer arr[] = new Integer[] {1,2,3,4,5,6,7,8,9,10}; 
        int k = 2; 
        System.out.print("K'th smallest element is " + kthSmallest(arr,k)); 
    } 
}
