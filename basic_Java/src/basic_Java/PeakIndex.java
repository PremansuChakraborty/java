//You are given an integer mountain array arr of length n where the values increase to a peak element and then decrease.
//
//Return the index of the peak element.
//
//Your task is to solve it in O(log(n)) time complexity.
//
// 
//
//Example 1:
//
//Input: arr = [0,1,0]
//
//Output: 1
//
//Example 2:
//
//Input: arr = [0,2,1,0]
//
//Output: 1
//
//Example 3:
//
//Input: arr = [0,10,5,2]
//
//Output: 1

package basic_Java;

//import java.util.Scanner;

public class PeakIndex {
    public static int peakIndexInMountainArray(int[] arr) {
        int start=0,end=arr.length-1,mid=0;
        while(start<=end){
            mid=start+(end-start)/2;
            if(arr[mid]<=arr[mid+1]){
                start=mid+1;
            }
            else if(arr[mid]<=arr[mid-1]){
                end=mid-1;
            }
            else{
                break;
            }
        }
        return mid;
    }
    

    
    public static void main (String[]args) {

  	  int[] arr= {0,3,5,12,2};
  	System.out.println(peakIndexInMountainArray(arr));
  	  
    }
}
