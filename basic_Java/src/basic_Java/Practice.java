package basic_Java;
import java.util.*;
public class Practice {
//	    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
//	         ArrayList<Integer> list =new ArrayList<Integer>();
//	         for(int i:nums1){
//	            list.add(i);
//	         }
//	        for(int i:nums2){
//	            list.add(i);
//	         }
//	        //need to sort
//	        for(int j=list.size()-1;j>0;j--) {
//	        for(int i=list.size()-1;i>0;i--) {
//	        	if(list.get(i)<list.get(i-1)) {
//	        		int temp=list.get(i);
//	        		list.set(i,list.get(i-1));
//	        		list.set(i-1,temp);
//	        	}
//	        }
//	        }
////	        System.out.println(list);
//	         int size=list.size();
//	         int n=size/2;
//	         if(size%2==0){
////	        	 System.out.println(list.get(n));
////	        	 System.out.println(list.get(n-1));
//	            return ((double)(list.get(n))+(double)(list.get(n-1)))/2;
//	         }
//	         return list.get(n);
//	    }
    public static char nextGreatestLetter(char[] letters, char target) {
        int start=0,end=letters.length-1,mid=0;
        if((int)target<(int)letters[end]){
        while(start<=end){
            mid=start+(end-start)/2;
            if((int)target>=(int)letters[mid]){
                  start=mid+1;
            }
            else{
                end=mid-1;
            }
        }
        return letters[start];
        }
        return letters[start];
    }
	    public static void main(String[]args) {
//	    	int[] nums1= {1,3};
//	    	int[] nums2= {2};
//	    	System.out.println(findMedianSortedArrays(nums1,nums2));
//	    	String str="jdsjovnw";
//	    	char ch='d';
//	    	System.out.println((int)str.charAt(1));
//	    	System.out.print((int)ch);
	    	
	    	char[] ch= {
	    			'x','x','y','y'
	    	};
	    	System.out.print(nextGreatestLetter(ch,'z'));
	    }
	    
	    
	
}
