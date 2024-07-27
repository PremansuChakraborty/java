package basic_Java;
import java.util.*;
public class Switch {
			static void checkLeapYear() {
				System.out.print("Enter the Year: ");
				Scanner obj1=new Scanner(System.in);
				int year=obj1.nextInt();
				if(year%400==0) {
					System.out.print("29 days.");
					System.exit(0);
				}
				else if(year%4==0 && year%100!=0) {
					System.out.print("29 days.");
					System.exit(0);
				}
				else {
					System.out.print("28 days.");
					System.exit(0);
				}
				obj1.close();
			}
	
			static void noOfDays(String s) {
				String s1=s.toLowerCase();
				switch(s1){
				case "january":
				case "march":
				case "may":
				case "july":
				case "august":
				case "october":
				case "december":
					System.out.println("31 days");
					break;
				case "april":
				case "june":
				case "september":
				case "november":
					System.out.println("30 days");
					break;
				case "february":
					checkLeapYear();
					break;
				default:
					System.out.println("30 days");
				
			}
			}
	
			public static void main(String[]args) {
				Scanner obj=new Scanner(System.in);
				System.out.print("Enter month name: ");
				String month=obj.next();
				noOfDays(month);
				obj.close();
			}
}
