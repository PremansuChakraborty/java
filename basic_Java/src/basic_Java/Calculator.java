package basic_Java;
import java.util.*; 
public class Calculator {
	
	        public static void calculator() {
	        	System.out.print("Enter two integer number: ");
				Scanner obj2= new Scanner(System.in);
				int a=obj2.nextInt(),b=obj2.nextInt();
				System.out.print("Enter the operator: + - * / % : ");
				char op = obj2.next().charAt(0);
				
				if (op=='+') {
					System.out.println("sum of "+ a+" & "+b+ "=" +(a+b));
				}
				else if (op=='-') {
					System.out.println("subtrsction of "+ a+" & "+b+ "=" +(a-b));
				}
				else if (op=='*') {
					System.out.println("multipication of "+ a+" & "+b+ "=" +(a*b));
				}
				else if (op=='/') {
					if(b!=0) {
					System.out.println("division of "+ a+" & "+b+ "=" +(a/b));
				}
					else {
						System.out.println("invalid input");
					}
				}
				else if (op=='%') {
					System.out.println("modulo of "+ a+" & "+b+ "=" +(a%b));
				}
				
				obj2.close();
				
	        }
	        
	        
	
			public static void main (String[]args) {
				Scanner obj=new Scanner(System.in);
				
				System.out.println("Enter Y or y to use Calculator.");
				
				char ch=obj.next().trim().charAt(0);
				
				if(ch=='Y' || ch=='y') {
					calculator();
				}
				
				obj.close();
				
				
			}
}
