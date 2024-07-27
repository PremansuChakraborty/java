package basic_Java;
import java.util.Scanner;
import java.util.Arrays;
public class BinarySearch {
	//it is good if the array is in ascending order 
	static int binarySearchAscending(int[] a,int target) {
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(target<a[mid]) {
				high=mid-1;
			}
			else if(target>a[mid]) {
				low=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}

//	
//	    static int binarySearch2(int[] a,int low,int high,int target) {
//	    	int n=(low+high)/2;
//	    	if(target>=a[low] && target<=a[high]) {
//	    	 if(a[n]==target) {
//	    		return n;
//	    	}
//	    	else if(target<a[n]) {
//	    		high=n-1;
//	    		return binarySearch( a, low, high, target);
//	    		
//	    	}
//	    	else if(target>a[n]) {
//	    		low=n+1;
//	    		return binarySearch( a,low, high, target);
//	    	}
//	    	}
//	    	return -1;
//	    	
//	    }
//	
	
	//it is good if the array is in descending order 
	static int binarySearchDescending(int[] a,int target) {
		int low=0,high=a.length-1;
		while(low<=high) {
			int mid=low+(high-low)/2;
			if(target>a[mid]) {
				high=mid-1;
			}
			else if(target<a[mid]) {
				low=mid+1;
			}
			else {
				return mid;
			}
		}
		return -1;
	}
	
	
	//best combination of both;
	static int binarySearch(int[] a,int target) {
		int low=0,high=a.length-1,mid;
		while(low<=high) {
			mid=low+(high-low)/2;
			if(a[low]<a[high]) {
				if(target<a[mid]) {
					high=mid-1;
				}
				else if(target>a[mid]) {
					low=mid+1;
				}
				else {
					return mid;
				}
			}
			else {
				if(target>a[mid]) {
					high=mid-1;
				}
				else if(target<a[mid]) {
					low=mid+1;
				}
				else {
					return mid;
				}
			}
		}
		return -1;
	}

	
		public static void main(String[]args) {
			int[]arr= {
					5,7,8,9,12,30,62,85,88,100 //Sorted array
			};
			int[] arr2= {
					98,87,74,65,54,41,31,20,10,0,-14
			};
			Scanner obj=new Scanner(System.in);
			System.out.print("enter search element: ");
			int target=obj.nextInt();
//			System.out.print("index is: "+binarySearchAscending(arr,target));
//			System.out.print("index is: "+binarySearchDescending(arr2,target));
			System.out.print("index is: "+binarySearch(arr,target));
			obj.close();
		}
}
