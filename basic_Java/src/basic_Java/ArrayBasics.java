package basic_Java;
import java.util.Arrays;
public class ArrayBasics {
       
	public static void main(String[]args) {
//		int[] ar=new int[5];
//		int[] arr= {56,85,6,3,5,46,8};
//		
////		for(int i=0;i<arr.length;i++) {
////			System.out.print(arr[i]+" ");
////		}
//		
//		System.out.print(Arrays.toString(arr));
		
//		int [][] ar2d=new int[3][];
		
		int [][] ar2D= {
				{1,2,3,4},
				{5,6},
				{7,8,9,10}
		};
		for(int i=0; i<ar2D.length;i++) {
		System.out.print(Arrays.toString(ar2D[i]));
		System.out.println();
		}
	}
}
