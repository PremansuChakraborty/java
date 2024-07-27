package basic_Java;
import java.util.Arrays;
//totally sorted matrix
public class binarySearchinMatrix {
	static int[] binarySearch(int[][] a,int target){
		int row=a.length;
		int col=a[0].length;
		
	    
		for(int i=0;i<row;i++) {
			if(a[i][0]>target) {
				row=i;
				break;
			}
		}
       
		for(int i=0;i<col;i++) {
			if(a[row-1][i]==target) {
				return new int[] {row-1,i};
			}
		}
		
		return new int[] {-1,-1};
		
		
	}
	static void printMatrix(int[][] a) {
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args) {
		int[][] ar= {
				{1,2,3,4},
				{5,6,7,8},
				{10,11,12,13},
				{14,16,89,100}
		};
		printMatrix(ar);
		System.out.println(Arrays.toString(binarySearch(ar,16)));
		
	}
}
