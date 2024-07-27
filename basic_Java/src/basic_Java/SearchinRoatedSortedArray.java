package basic_Java;

public class SearchinRoatedSortedArray {
	  public static int search(int[] nums, int target) {
		        int left = 0;
		        int right = nums.length - 1;

		        while (left < right) {
		            int mid = left + (right - left) / 2;
		            if (nums[left] < nums[mid]) {
		                left = mid;
		            } else if (nums[left] > nums[mid]) {
		                right = mid - 1;
		            } 
		            else {
		            	break;
		            }
		        }

        System.out.println(nums[left]);
		if(nums[left]<target) {
			return binarySearch(left+1,nums.length-1,target,nums);
		}
        return binarySearch(0,left,target,nums);
		
    }


static int binarySearch(int start,int end,int target,int[] nums){
    int mid=0;
    if(start==end) {
        if(nums[start]==target){
    	return start;
        }
        return -1;
        }
    System.out.println(start+","+end);
     while(start<=end){
            mid=start+(end-start)/2;
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                end=mid-1;
            }
            else{
                start=mid+1;
            }
        }
        return -1;
}
public static void main(String[]args) {
	 int[] a= {1,3};
	 System.out.println(search(a,3));
}
}
