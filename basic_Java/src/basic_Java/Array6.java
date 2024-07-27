package basic_Java;
import java.util.*;
public class Array6 {
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
    
    // 0 1 0 4 12 -> 1 4 12 0 0       0 2 0 0 3 1 0
    
    public static int[] zeroAtEnd(int[] ar) {
    	for(int i=0;i<ar.length;i++) {
    		if(ar[i]==0) {
    			ar=swapTillEnd(i,ar);
    		}
    	}
    	return ar;
    }
	
    public static int[] swapTillEnd(int n,int[] ar) {
    	for(int i=n;i<(ar.length-1);i++) {
    		if(ar[i+1]!=0) {
    		int temp=ar[i];
    		ar[i]=ar[i+1];
    		ar[i+1]=temp;
    	}
    		else if ((i+2)<ar.length) {
    			ar=swapTillEnd((i+1),ar);
    		}
    	}
    	return ar;
    }
    
	public static void main(String[]args) {
		System.out.print("size = ");
		Scanner obj2=new Scanner(System.in);
		int size=obj2.nextInt();
		int[] array=creationArray(size);
		printArray(array);
		System.out.println("**********************************");
		printArray(zeroAtEnd(array));
		
		obj2.close();
	}
}
