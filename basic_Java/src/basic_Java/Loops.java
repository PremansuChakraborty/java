package basic_Java;
import java.util.Scanner;
public class Loops {
	public static void main (String[]args) {
   Scanner obj = new Scanner(System.in);
   int val = obj.nextInt();
   int var1=val;
   while(var1>0) {
	   System.out.print(var1);
	   var1--;
   }
   
   
   System.out.println(" ");
   int var2=val;
   do {
	   System.out.print(var2);
	   var2--;
   }while(var2>0);
   
   
   System.out.println(" ");
   for(int var3=1; var3<val+1 ; var3++) {
	   System.out.print(var3);
   }
   
   obj.close();
}
}