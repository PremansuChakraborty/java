package basic_Java;

public class FindNoOfRotation {
//	       static int countRotation(int[] a) {
//	    	   int lowest=0;
//	    	   for(int i=1;i<a.length;i++) {
//	    		   if(a[i]<a[lowest]) {
//	    			   lowest=i;
//	    		   }
//	    	   }
//	    	   return lowest;
//	       }
	static int countRotation(int[] nums) {
        int left=0,right=nums.length-1,mid=0;
        while(left<right){
             mid = left + (right - left) / 2;
            if (nums[left] < nums[mid]) {
                left = mid;
            } else if (nums[left] > nums[mid]) {
                right = mid - 1;
            } else { 
                left = left + 1;
            }
        }
		return left+1;
	}
	
           public static void main(String[]args) {
        	   int[] a= {15,18,23,38,40,51,-2,-1,0,1,3,7,9};
        	   System.out.println(countRotation(a));
           }
}
