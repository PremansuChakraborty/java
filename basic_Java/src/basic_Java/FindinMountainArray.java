package basic_Java;

public class FindinMountainArray {
	// package basic_Java;

		 public static int findInMountainArray(int target, int[] mountainArray) {
		        int start=0,end=mountainArray.length-1,mid=0,peak=0;
		        while(start<=end){
		            mid=start+(end-start)/2;
		            if(mountainArray[mid]<=mountainArray[mid+1]){
		                start=mid+1;
//		                System.out.println("s: "+start);
		            }
		        else if(mountainArray[mid]<=mountainArray[mid-1]){
		                end=mid-1;
//		                System.out.println("e: "+end);
		            }
		            else{
		                peak=mid;
		                break;
		            }
		        }
		        start=0;end=peak;mid=0;
		        while(start<=end){
		            mid=start+(end-start)/2;
		            if(target==mountainArray[mid]){
		                return mid;
		            }
		            else if(target<=mountainArray[mid]){
		                end=mid-1;
		            }
		            else{
		            	start=mid+1;
		            }
		        }
		    
		        start=peak+1;end=mountainArray.length-1;mid=0;
		        while(start<=end){
		            mid=start+(end-start)/2;
		            if(target==mountainArray[mid]){
		                return mid;
		            }
		            else if(target<=mountainArray[mid]){
		                start=mid+1;
		            }
		            else{
		            	end=mid-1;
		            }
		        }
		        return -1;
		    }
		 
		 public static void main(String[]args) {
			 int[] a= {1,2,3,4,5,3,1,0};
			 System.out.println(findInMountainArray(0,a));
		 }
	}


