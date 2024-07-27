package basic_Java;
import java.util.*;
public class FindAsciiValue {
       public static void main(String[]args) {
    	   Scanner in= new Scanner(System.in);
    	   System.out.print("ch: ");
    	   char ch=in.next().charAt(0);
    	   System.out.println("ASCII: "+(int)(ch));
    	   in.close();
       }
}
