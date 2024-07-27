package basic_Java;
//floor value of 5: 5 or biggest smaller num than 5.

import java.util.Scanner;

//problem we will have an sorted array. we need to find that floor value for an target in that array.

//all problems of an sorted array will try to solve by binary search. 
public class FloorValue {
           static int findFloor(int[] a, int target) {
        	   int low=0,high=a.length-1,mid=0;
        	   while(low<=high) {
        		   mid=low+(high-low)/2;
        		   if(target==a[mid]) {
        			   return a[mid];
        		   }
        		   else if(target<a[mid]) {
        			   high=mid-1;
        		   }
        		   else {
        			   low=mid+1;
        		   }
        	   }
        	   return a[high];
           }
           
           public static void main (String[]args) {
   			int[]arr= {
   					5,7,8,9,12,30,62,85,88,100 //Sorted array
   			};
//   			int[] arr2= {
//   					98,87,74,65,54,41,31,20,10,0,-14
//   			};
   			Scanner in=new Scanner(System.in);
   			System.out.print("enter target: ");
   			int target=in.nextInt();
   			System.out.println("ceiling value: "+findFloor(arr,target));
   			
   			in.close();
   		}
}
