package basic_Java;

import java.util.Arrays;

public class SelectionSort {
	public static void main(String[]args) {
		int[] ar= {5,78,9,36,0,12,-1,56,14,2};
		int size=ar.length;
		for(int i=size-1;i>0;i--) {
			int max=0;
		for(int j=0;j<=i;j++) {
			if(ar[j]>ar[max]) {
				max=j;
			}	
		}
		int temp=ar[max];
		ar[max]=ar[i];
		ar[i]=temp;
		}
		System.out.println("Sorted Array: "+Arrays.toString(ar));
	}
}
