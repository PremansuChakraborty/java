package basic_Java;

import java.util.Arrays;

public class IncertionSort {
	public static void main(String[]args) {
		int[] ar= {5,78,9,36,0,12,-1,56,14,2};
		int size=ar.length;
		for(int i=1;i<size;i++) {
			for(int j=i;j>0;j--) {
				if(ar[j]<ar[j-1]) {
					int temp=ar[j-1];
					ar[j-1]=ar[j];
					ar[j]=temp;
				}
				else {
					break;
				}
			}
		}
		System.out.println("Sorted Array: "+Arrays.toString(ar));
	}
}
