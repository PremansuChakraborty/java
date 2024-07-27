package basic_Java;
import java.util.ArrayList;
import java.util.Date;
public class StringBasics {
       public static void main(String[]args) {
    	   String a="Prem";
    	   String b="Prem";
    	   System.out.println(a==b); //true-->a and b pointing at the same object prem.
    	   
    	   String c=new String("Sohon");
    	   String d=new String("Sohon");
    	   System.out.println(c==d); //false-->c and d pointing at different object Sohon.
    	   System.out.println(c.equals(d)); //true-->comparing inner values only
    	   
    	   //traverse throw each character
    	   
    	   System.out.println(c.charAt(0));
    	   
    	   
    	   System.out.println("a"+"b");//both String=String
    	   System.out.println("a"+'b');//String+char=String
    	   System.out.println('a'+'b');//Char+Char=Int Ascii value
    	   System.out.println((char)('a'+3));//d
    	   System.out.println("a"+3); //String+int=String
    	   int n='0'-'0';
    	   System.out.println((n));
    	   System.out.println("Prem"+ new ArrayList<>());//String+ArrayList=String
    	   System.out.println("Prem"+ new Integer(56)); // String+ integer object= string
    	   
    	   /*
    	    * %c - Character
%d - Decimal number (base 10)
%e - Exponential floating-point number
%f - Floating-point number
%i - Integer (base 10)
%o - Octal number (base 8)
%s - String
%u - Unsigned decimal (integer) number
%x - Hexadecimal number (base 16)
%t - Date/time
%n - Newline
    	    */
    	   
//    	   int age=21;
//    	   String name="Prem";
//    	   System.out.printf("Hello,%n My name is %s and my age is %d %n", name,age);
//    	   
//    	   Date now = new Date(); //java.util.Date
//           
//           // Example of using %t with format flags
//           System.out.printf("Current date and time: %tY-%tm-%td %tH:%tM:%tS%n", now, now, now, now, now, now);
//    	   
       }
}
