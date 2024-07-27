package basic_Java;

import java.util.Arrays;

/*
 * Example 1:
Input: string = “123xyz”
Output: 123

Example 2:
Input: string = “1xyz23”
Output: 24
 */
public class SumOfNumbersString {
	public static void main(String[]args) {
		String s="1xyz23";
	    int[] ar=new int[(s.length()/2)+1];
	    int pointer=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9') {
		      ar[pointer]=ar[pointer]*10+(s.charAt(i)-'0');
		      continue;
			}
           pointer++;
		}
		int sum=0;
		for(int i=0;i<ar.length;i++) {
			sum=sum+ar[i];
		}
		
	System.out.println(Arrays.toString(ar));
	}
}
