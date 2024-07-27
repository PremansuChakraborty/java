//34. Find First and Last Position of Element in Sorted Array
//Medium
//Topics
//Companies
//Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.
//
//If target is not found in the array, return [-1, -1].
//
//You must write an algorithm with O(log n) runtime complexity.
//
// 
//
//Example 1:
//
//Input: nums = [5,7,7,8,8,10], target = 8
//Output: [3,4]
//Example 2:
//
//Input: nums = [5,7,7,8,8,10], target = 6
//Output: [-1,-1]
//Example 3:
//
//Input: nums = [], target = 0
//Output: [-1,-1]

package basic_Java;
import java.util.Arrays;
public class Leedcode34 {
		public static int[] searchRange(int[] nums, int target) {
                 int[] result= {-1,-1};
                 int start=0,end=nums.length-1,mid=0;
                 //find first occurrence
                 while(start<=end) {
                	 mid=start+(end-start)/2;
                	 if(target==nums[mid]) {
                		 result[0]=mid;
                		 end=mid-1;
                	 }
                	 else if(target<nums[mid]){
                		 end=mid-1;
                	 }
                	 else {
                		 start=mid+1;
                	 }
                 }
                 
                 //find Second occurrence
                 start=0;
                 end=nums.length-1;
                 mid=0;
                 while(start<=end) {
                	 mid=start+(end-start)/2;
                	 if(target==nums[mid]) {
                		 result[1]=mid;
                		 start=mid+1;
                	 }
                	 else if(target<nums[mid]){
                		 end=mid-1;
                	 }
                	 else {
                		 start=mid+1;
                	 }
                 }
                 
                 return result;
			}
         
	 public static void main(String[]args) {
		 int[] nums = {};
		 int target = 0;
		 System.out.println(Arrays.toString(searchRange(nums,target)));
		 
	 }
}
