package basic_Java;
import java.util.*;

//ceiling value of 5 -> 5 or the smallest number that is grater than 5.

//problem we will have an sorted array. we need to find that ceiling value for an target in that array.

//all problems of an sorted array will try to solve by binary search. 
public class CeilingValue {
	
	    static int findCeilingValue(int[] a,int target) {
	    	int start=0,end=a.length-1,mid;
	    	while(start<=end) {
	    		mid=start+(end-start)/2;
	    		//ascending order
//	    		if(a[start]<a[end]) {
	    		if(target==a[mid]) {
	    			return a[mid];
	    		}
	    		else if(a[mid]<target) {
	    			start=mid+1;
	    		}
	    		else {
	    			end=mid-1;
	    		}
//	    		}
	    		//descending order
//	    		else {
//	    			if(target==a[mid]) {
//	    				return mid;
//	    			}
//	    			else if(target<a[mid]) {
//	    				start=mid+1;
//	    			}
//	    			else {
//	    				end=mid-1;
//	    			}
//	    		}
	    	}
	    	return a[start];
	    }
		public static void main (String[]args) {
			int[]arr= {
					5,7,8,9,12,30,62,85,88,100 //Sorted array
			};
//			int[] arr2= {
//					98,87,74,65,54,41,31,20,10,0,-14
//			};
			Scanner in=new Scanner(System.in);
			System.out.print("enter target: ");
			int target=in.nextInt();
			System.out.println("ceiling value: "+findCeilingValue(arr,target));
			
			in.close();
		}
}
