package basic_Java;
import java.util.*; 
public class Stings {
       public static void main(String[]args) {
    	   Scanner in=new Scanner(System.in);
    	   System.out.print("Enter a String: ");
    	   String str = in.next();
//    	   System.out.println(str.charAt(5)); //6th char
    	   
    	   //Perform linear search on String
    	   System.out.print("Enter the char to Search: ");
    	   char ch = in.next().charAt(0);
    	   linearSearch(ch,str);
    	   in.close();
       }
       
       static void linearSearch(char ch,String str) {
    	   if(str.length()==0) {
    		   System.out.print("Enter valid String: ");
    		   System.exit(0);
    	   }
    	   else {
    		   for(int i=0; i<str.length();i++) {
    			   if(ch==str.charAt(i)) {
    	    		   System.out.print(ch+" is present in "+i+"th index.");
    	    		   System.exit(0); 
    			   }
    		   }
    		   System.out.print("NOT present.");
    		   System.exit(0);
    	   }
       }
}
