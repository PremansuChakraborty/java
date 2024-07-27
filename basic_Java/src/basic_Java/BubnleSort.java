package basic_Java;
import java.util.Arrays;
public class BubnleSort {
	public static void main(String[]args) {
		int[] ar= {5,78,9,36,0,12,-1,56,14,2};
		boolean isSorted;
		for(int j=ar.length-1;j>0;j--) {
			isSorted=true;
		for(int i=0;i<j;i++) {
			if(ar[i]>ar[i+1]) {
				int temp=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=temp;
				isSorted=false;
			}
		}
		if(isSorted) break;
	}
		System.out.println("Sorted Array: "+Arrays.toString(ar));
	}
}
