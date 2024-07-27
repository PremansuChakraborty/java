package basic_Java;
import java.util.Scanner;
public class Arrays {
          public static int[] arrayCreation(int n) {
        	  int[] myArray=new int[n];
        	  Scanner obj= new Scanner(System.in);
        	  for(int i=0; i<n; i++) {
        		  System.out.print("enter "+(i+1)+"th element: ");
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
          
          public static void main(String[]args) {
        	  Scanner obj2=new Scanner(System.in);
        	  System.out.print("Enter the size: ");
        	  int size=obj2.nextInt();
        	  int[] array=arrayCreation(size);
        	  printArray(array);
        	  obj2.close();
          }
}
