package basic_Java;

public class TypeCasting {
//      automatic type casting
	public static void main(String[]args) {
		float var = 56;
		 System.out.println(var);	
//		 int var2 = 56.02f;  error
//		 System.out.print(var2);
		 int var2 = (int)56.02f;  //typecasting
		 System.out.println(var2);
		 
//		 byte var3=156; // 126 max size
//		 System.out.print(var3);
		 byte var3=(byte)156; // 126 max size
		 System.out.println(var3);
		 
		 // int-char
		 
		 int var4='A';
		 System.out.println(var4);
		 
		 byte b=36;
		 char c='A';
		 short s=1024;
		 int i=56300;
		 float f=53.6f;
		 double d=0.12365492;
		 
		 double result=(f*b)+(i/c)-(d*s);
		 
		 System.out.println((f*b)+"  "+(i/c)+"  "+(d*s));
		 System.out.println(result);
		 
	}

      
}
