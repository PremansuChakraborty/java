package basic_Java;
import java.util.Scanner;
import java.util.ArrayList;
public class PalindromString {
	static boolean palindromChecker(String str) {
	String sLow=str.toLowerCase();
            char[] chAr=sLow.toCharArray();
    ArrayList<Character> list=new ArrayList<>();
    for(int i=0;i<chAr.length;i++){
        if(chAr[i]>='a' && chAr[i]<='z'){
            list.add(chAr[i]);
        }
        else{
            continue;
        }
    }

    // System.out.println(sLow);
    int len=list.size();
	int mid=len/2;
	//odd size string
	if(len%2==0) {
		for(int i=0;i<mid;i++) {
			if(list.get(i)==list.get((len-1)-i)) {
				continue;
			}
			else {
				return false;
			}
		}
	}
	
	else {
		for(int i=0;i<=mid;i++) {
			if(list.get(i)==list.get((len-1)-i)) {
				continue;
			}
			else {
				return false;
			}
		}
	}
	return true;
}

	
	
    public static void main(String[]args) {
    	Scanner obj=new Scanner(System.in);
    	System.out.print("enter your string: ");
    	String str=obj.nextLine();
    	System.out.println(str);
    	System.out.println(palindromChecker(str));
    	
    	obj.close();
    }
}
