package basic_Java;
import java.util.*;
import java.util.Arrays;
public class CountVowelConsonantSpaces {
	
	    static int[] count(String str) {
	    	int[] res= {0,0,0};
	    	str=str.toLowerCase();
	    	if (str.length()==0) {
	    		return new int[]{-1,-1,-1};
	    	}
	    	for(int i=0;i<str.length();i++) {
	    		if(str.charAt(i)=='a' || str.charAt(i)=='e' || str.charAt(i)=='i' || str.charAt(i)=='o' || str.charAt(i)=='u') {
	    			res[0]++;
	    		}
	    		else if(str.charAt(i)>'a' && str.charAt(i)<='z') {
	    			res[1]++;
	    		}
	    		else if(str.charAt(i)==' ') {
	    			res[2]++;
	    		}
	    	}
	    	return res;
	    	
	    }
         public static void main(String[] args) {
        	 Scanner obj= new Scanner(System.in);
        	 System.out.print("enter a string: ");
        	 String str= obj.nextLine();
        	 System.out.println("[Vowels,Consonants,Spaces]=> "+Arrays.toString(count(str)));
        	 obj.close();
         }
}
