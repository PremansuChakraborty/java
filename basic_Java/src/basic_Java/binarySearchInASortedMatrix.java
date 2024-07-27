package basic_Java;
import java.util.Arrays;
//matrix is sorted by row and sorted by column
public class binarySearchInASortedMatrix {
	
	static int[] binarySearch(int[][] a,int target) {
		int[] result= {-1,-1};
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<row;i++) {
			for(int j=0;j<col;j++) {
				if(a[i][j]==target) {
					result[0]=i;
					result[1]=j;
					break;
				}
				else if (a[i][j]>target) {
//					col=col-(col-j);
					col=j;
				}
				else {
					continue;
				}
			}
		}
		
		return result;
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
	 public static void main(String[]args) {
		 int[][] ar= {
				 {10,21,25,37},
				 {33,63,73,89},
				 {47,69,77,97},
				 {59,70,82,101}
		 };
		 printMatrix(ar);
		 System.out.println(Arrays.toString(binarySearch(ar,97)));

	 }
}
