package basic_Java;

import java.util.Scanner;

public class Array3 {
    public static int[] arrayCreation(int n) {
  	  int[] myArray=new int[n];
  	  Scanner obj= new Scanner(System.in).useDelimiter("[,\\s+]");
  	  System.out.print("enter elements: ");
  	  for(int i=0; i<n; i++) {
  		  myArray[i]=obj.nextInt();
  	  }
  	  obj.close();
  	  return myArray;
    }
    
    
    public static int[] reverseArray(int[] ar) {
    	int start=0, end=(ar.length-1);
    	while(start<end) {
    		int temp=ar[start];
    		ar[start]=ar[end];
    		ar[end]=temp;
    		start++;
    		end--;
    	}
    	return ar;
    }
    
    public static void printArray(int[] arr) {
    	System.out.print("Output Array: ");
  	  for(int i=0; i<arr.length;i++) {
  		  System.out.print(arr[i]+" ");
  	  }
    }
    
       public static void main (String[]args) {
    	   System.out.print("Enter the size: ");
    	   Scanner obj2 = new Scanner (System.in);
    	   int size = obj2.nextInt();
    	   printArray(reverseArray(arrayCreation(size)));
    	   obj2.close();
       }
}
