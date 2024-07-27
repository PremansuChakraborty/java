package basic_Java;
import java.util.*;
public class CountOfOccurrenceByHashmap {
	
	static int countOfOccurrence(String str,char ch) {
		HashMap<Character,Integer> mp = new HashMap<>();
		for(int i=0;i<str.length();i++){
            if(mp.get(str.charAt(i))==null){
               mp.put(str.charAt(i),1);
            }
            else{
            mp.put(str.charAt(i),mp.get(str.charAt(i))+1);
            }
        }
		if(mp.get(ch)==null) {
			return 0;
		}
		return mp.get(ch);
	}
	    
	
	public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.print("enter the String: ");
        String str=in.nextLine();
        System.out.print("enter Character: ");
        char ch=in.next().charAt(0);
        System.out.printf("number of occurences of %c: %d",ch,countOfOccurrence(str,ch));
        in.close();
	}
}
