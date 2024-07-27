package basic_Java;
//import java.math.*;
public class BSOnInfiniteArray {
	//not use ar.length function and complete binary search
	    static int BinarySearchOnInfiniteArray(int[] ar,int target) {
	    	int start=0,end=1,n=1,mid=0;
	    	while(target>ar[end]) {
	    		start=end+1;
	    		end=start+(int)Math.pow(2,n);
	    		n++;
	    	}
	    	while(start<=end) {
	    		mid=start+(end-start)/2;
	    		if(target==ar[mid]) {
	    			return mid;
	    		}
	    		else if(target<ar[mid]) {
	    			end=mid-1;
	    		}
	    		else {
	    			start=mid+1;
	    		}
	    	}
	    	return -1;
	    	

	    }
        public static void main(String[]args) {
        	int[] ar={
        			5,6,7,8,9,12,13,45,46,74,75,76,78,99,100,102,103,109
        	};
        	System.out.print(BinarySearchOnInfiniteArray(ar,74));
        }
}
