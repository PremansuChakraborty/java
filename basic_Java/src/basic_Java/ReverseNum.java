package basic_Java;
import java.util.*;
public class ReverseNum {
			public static int reverseNum(int n) {
				int store=n, renum=0;
				while(store!=0) {
					renum=renum*10+(store%10);
					store=store/10;
				}
				return renum;
			}
	    
         public static void main(String[]args){
        	 System.out.print("enter NUMBER: ");
        	 Scanner obj = new Scanner(System.in);
        	 int num=obj.nextInt();
        	 System.out.print("Reverse NUMBER: "+reverseNum(num));
        	 obj.close();
         }
}
