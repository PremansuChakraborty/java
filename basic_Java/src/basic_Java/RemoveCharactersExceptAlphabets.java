package basic_Java;

public class RemoveCharactersExceptAlphabets {
	public static void main(String[]args) {
		String str="OIOOppp[156kqi_(&&*&%*+od;;'ad;.saaaa";
		String res="";
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)>='a' && str.charAt(i)<='z' || str.charAt(i)>='A' && str.charAt(i)<='Z') {
				String s=Character.toString(str.charAt(i));
				res=res+s;
			}
		}
		System.out.println(res);
	}
}
