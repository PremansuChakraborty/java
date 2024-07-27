package basic_Java;

import java.util.Arrays;

public class AnagramString {
     public static void main(String[] agrs) {
    	 String str1="CAT";
    	 String str2="ACT";
    	 char[] ar1= str1.toCharArray();
    	 char[] ar2= str2.toCharArray();
    	 Arrays.sort(ar1);
    	 Arrays.sort(ar2);
    	 if(Arrays.toString(ar1).equals(Arrays.toString(ar2))) {
    		 System.out.println(true);
    	 }
    	 else System.out.println(false);

     }
}
