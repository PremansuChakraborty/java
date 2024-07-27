package basic_Java;

import java.util.Scanner;

public class Array5 {
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
	
	public static int secondMax(int[] ar){
		int max1=0,max2=0;
		for (int i=0;i<ar.length;i++) {
			if(ar[i]>max1) {
				max2=max1;
				max1=ar[i];
			}
			else if (ar[i]>max2 && ar[i]!=max1) {
				max2=ar[i];
			}
		}
		return max2;
	}
	//13 34 2 34 33 1
	public static void main (String[]args) {
		 Scanner obj2=new Scanner(System.in);
   	  System.out.print("enter size: ");
   	  int size=obj2.nextInt();
   	  int[] arr=creationArray(size);
   	  System.out.println("Second max element: "+secondMax(arr));
   	  obj2.close();
	}
}
