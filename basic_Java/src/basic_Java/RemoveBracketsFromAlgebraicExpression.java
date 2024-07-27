package basic_Java;

public class RemoveBracketsFromAlgebraicExpression {
	public static void main(String[]args) {
		String s="a+((b-c)+d)";
		String res="";
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!='(' && s.charAt(i)!=')' && s.charAt(i)!='[' && s.charAt(i)!=']' && s.charAt(i)!='{' && s.charAt(i)!='}') {
				res=res+Character.toString(s.charAt(i));
			}
		}
		System.out.println(res);
	}
}
