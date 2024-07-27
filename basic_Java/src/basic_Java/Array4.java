package basic_Java;
import java.util.*;
public class Array4 {
	
			public static int[] creationArray(int n){
				Scanner obj = new Scanner (System.in).useDelimiter("[,\\s+]");
				int[] myArray= new int[n];
				System.out.print("enter array elements: ");
				for(int i=0; i<n;i++) {
					myArray[i]=obj.nextInt();
				}
				obj.close();
				return myArray;
			}
			
	        public static void printArray(int[] arr) {
	        	  for(int i=0; i<arr.length;i++) {
	        		  System.out.println(i+1+"th element: "+ arr[i]);
	        	  }
	          }
	        
	        public static int maxElement(int[] ar) {
	        	int max=ar[0];
	        	  for(int i=1; i<ar.length;i++) {
	        		  if(max<ar[i]) {
	        			  max=ar[i];
	        		  }
	        	  }
	        	  return max;
	        }
	        
	        public static int minElement(int[] ar) {
	        	int min=ar[0];
	        	  for(int i=1; i<ar.length;i++) {
	        		  if(min>ar[i]) {
	        			  min=ar[i];
	        		  }
	        	  }
	        	  return min;
	        }
			
          public static void main(String[]args) {
        	  Scanner obj2=new Scanner(System.in);
        	  System.out.print("enter size: ");
        	  int size=obj2.nextInt();
        	  int[] arr=creationArray(size);
        	  System.out.println("max element: "+maxElement(arr));
        	  System.out.println("min element: "+minElement(arr));
        	  obj2.close();
          }
}
