package basic_Java;
import java.util.*;
import java.lang.Math;
public class AmstrongNum {
	
	//print all 3 digit amstrong num
	
	static String armstrongNumber(int n) {
        int ans=0;
        int num=n;
        while(num>0){
            ans=ans+(int)Math.pow(num%10,3);
            num=num/10;
        }
        return ans==n?"true":"false";
   }

//	
	public static void main(String[]args) {
		System.out.print("Enter the no of Digits: ");
		Scanner obj=new Scanner(System.in);
		int digit=obj.nextInt();
		System.out.println(armstrongNumber(digit));
//		isAmstrong(digit,10);
		obj.close();
	}

}
