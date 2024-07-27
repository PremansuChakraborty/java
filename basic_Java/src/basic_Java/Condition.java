package basic_Java;

import java.util.Scanner;
import java.lang.String;

public class Condition {
	public static void main(String[]args) {
//		Write a C program to input marks of Computer. Calculate percentage and grade according to following:.
		Scanner obj = new Scanner(System.in);
//		System.out.println("Enter the number out of 100:");
//		int num = obj.nextInt();
//		
//		if(num>80) {
//			System.out.println("percentage: "+num+"%"+ " grade: A+");
//		}
//		else if(num>60) {
//			System.out.println("percentage: "+num+"%"+ " grade: B+");
//		}
//		else if(num>40) {
//			System.out.println("percentage: "+num+"%"+ " grade: C+");
//		}
//		else {
//			System.out.println("percentage: "+num+"%"+ " grade: F");
//		}
		
//		largest number;
//		int a=obj.nextInt();
//		int b=obj.nextInt();
//		int c=obj.nextInt();
		
//		if(a>b) {
//			if(a>c) {
//				System.out.println(a+" is greater");
//			}else {
//				System.out.println(c+" is greater");
//			}
//		}
//		else {
//			if(b>c) {
//				System.out.println(b+" is greater");
//			}else {
//				System.out.println(c+" is greater");
//			}
//		}
//		Second method
//		int max =a;
//		
//		if (b>max) {
//			max=b;
//		}
//		if (c>max) {
//			max=c;
//		}
//		System.out.println(max+" is greater");
	
////	Third method
//		int max=Math.max(Math.max(a, b),c);
//		System.out.println(max+" is greater");
		
		
//		check upper case or lower case?
//		
//		//char input syntax
//		char c= obj.next().charAt(0);	//char c= obj.next().trim().charAt(0);
//		System.out.println(c);
//		
//		if (c>='a' && c<='z') {
//			System.out.println(c+" is lowercase");
//		}
//		else if (c>='A' && c<='Z') {
//			System.out.println(c+" is Uppercase");
//		}else {
//			System.out.println("input alphbets");
//		}
//		The Fibonacci sequence 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, and so on.??
		
//		int num = obj.nextInt();
//		int val0=0;
//		int val1=1;
//		int temp=0;
//		System.out.println(val0);
//		while(num>0) {
//			temp=val0+val1;
//			val0=val1;
//			System.out.println(val1);
//			val1=temp;
//			num--;
//		}
		
//		n=8759758747172357 count number of 7??
		
//		long n=8759758747172357L;
//		String s = Long.toString(n); 
//		int len= s.length();
//		int count=0;
//		for(int i=0; i<len; i++) {
//			if(s.charAt(i)=='7') 
//				count++;
//			
//		}
//		
//		System.out.println(count);
		
//		method 2
		
		long n=8759758747172357L;
		long x=n,y=0;
		int counter=0;
			while(x!=0){
				y=x%10;
				x=x/10;
				if(y==7){
					counter++;
				}
			}
			
			System.out.println(counter);
		
		
	}
		
}


