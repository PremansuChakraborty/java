package basic_Java;

public class PalindromeNumber {
	public static void main(String[]args) {
		int num=100212001;
		String s=Integer.toString(num);
        int i=0,j=s.length()-1;
        int check=0;
		while(i<j) {
			if(s.charAt(i)!=s.charAt(j)) {
				check=-1;
				break;
			}
			i++;
			j--;
		}
		if(check==-1)System.out.println("not a palinrom");
		else System.out.println("A palinrom");
	}
}
