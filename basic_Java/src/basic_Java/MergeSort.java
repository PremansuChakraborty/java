package basic_Java;
import java.util.ArrayList;
import java.util.Arrays;
public class MergeSort {
	
	public static void merge(int[] a, int start,int mid, int end) {
		ArrayList<Integer> list=new ArrayList<>();
		int i=start;
		int j=mid+1;
		
		while(i<=mid && j<=end) {
			if(a[i]<=a[j]) {
				list.add(a[i]);
				i++;
			}
			else {
				list.add(a[j]);
				j++;
			}
			
		}
		while(i<=mid)list.add(a[i++]);
		while(j<=end)list.add(a[j++]);
		
		for(int m=0;m<list.size();m++) {
			a[start+m]=list.get(m);
		}
	}
	
	public static void mergeSort(int[] a, int start, int end) {
		if(start==end)return;
		int mid=start+(end-start)/2;
		
		mergeSort(a,start,mid);
		mergeSort(a,mid+1,end);
		
		merge(a,start,mid,end);
		
	}
	
	
	
	public static void main(String[] args) {
		int[] a= {5,78,9,36,0,12,-1,56,14,2};
		
		mergeSort(a,0,(a.length-1));
		
		System.out.println(Arrays.toString(a));
	}

}
